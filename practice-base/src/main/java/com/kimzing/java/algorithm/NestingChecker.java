package com.kimzing.java.algorithm;/*
 * I attest that the code in this file is entirely my own except for the starter
 * code provided with the assignment and the following exceptions:
 * <Enter all external resources and collaborations here.>
 *
 * Note external code may reduce your score but appropriate citation is required
 * to avoid academic integrity violations. Please see the Course Syllabus as
 * well as the university code of academic integrity:
 *    https://catalog.upenn.edu/pennbook/code-of-academic-integrity/
 *
 * Signed,
 * Author: YOUR NAME HERE
 * Penn email: <YOUR-EMAIL-HERE@seas.upenn.edu>
 * Date: YYYY-MM-DD
 */

import java.util.Collections;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class NestingChecker {
    @SuppressWarnings("unused")
    private static final long serialVersionUID = 123674589918L;

    /**
     * TODO Implement this method!
     * Takes a nullable Queue of nullable elements and calculates its nesting status
     *
     * @param elements Nullable Queue of nullable Nestable elements
     * @return Non-null NestingReport describing the exact nesting status of the queue
     */
    public static NestingReport checkNesting(Queue<? extends Nestable> elements) {
        Stack<Nestable> stack = new Stack<>();
        // 队列为空，return a NestingReport with status set to NULL_INPUT, badItem
        if (elements == null || elements.isEmpty()) {
            return new  NestingReport(NestingReport.Status.NULL_INPUT, null, stack);
        }

        // 如果队列中有null元素, return a NestingReport with status set to NULL_ITEM,
        // badItem set to b (null), and stackState set to the current contents of the Stack.
        if (elements.stream().filter(e -> e == null).count() > 0) {
            return new NestingReport(NestingReport.Status.NULL_ITEM, null, stack);
        }

        while (true) {
            Nestable element = elements.poll();

            // 如果是OPEN标签，那么将其放入栈中,继续检查下一个元素
            if (element!= null && element.effect == Nestable.NestEffect.OPEN) {
                stack.add(element);
            }

            // 如果是CLOSE标签，那么与栈元素做对比
            // return a NestingReport with status set to INVALID_CLOSE, badItem set to b,
            // and stackState set to the current contents of the Stack (which should not include b).
            if (element!= null && element.getEffect() == Nestable.NestEffect.CLOSE) {
                // 如果栈为空或者栈顶元素不匹配
                if (stack.isEmpty() || !stack.peek().matches(element)) {
                    return new NestingReport(NestingReport.Status.INVALID_CLOSE, element, stack);
                }
                // 如果栈顶元素匹配，弹出栈顶
                if (stack.peek().matches(element)) {
                    stack.pop();
                }
            }

            // 如果队列为空的时候，但栈中仍有元素，说明是无效的嵌套，return a NestingReport with status set to
            // NOT_TERMINATED, badItem set to null, and stackState set to the current contents of the Stack.
            if (elements.isEmpty() && !stack.isEmpty()) {
                return new  NestingReport(NestingReport.Status.NOT_TERMINATED, null, stack);
            }

            // 如果元素为空，并且栈为空，说明是有效的内嵌
            if (elements.isEmpty() && stack.isEmpty()) {
                break;
            }

        }

        // 如果是有效的嵌套, then return a NestingReport with status set to VALID,
        // badItem set to null, and stackState set to the current contents of the Stack.
        return new NestingReport(NestingReport.Status.VALID, null, stack);
    }
}
