INSERT INTO `label`(id, name, `show`)
VALUES (1, "前端", 0),
       (2, "后端", 0),
       (3, "Java", 1),
       (4, "Vue", 1),
       (5, "React", 1),
       (6, "UniApp", 1),
       (7, "Python", 1),
       (8, "PHP", 1),
       (9, "Go", 1),
       (10, "Rust", 1),
       (11, "HTML", 1),
       (12, "Android", 1),
       (13, "IOS", 1),
       (14, "Ruby", 1);

INSERT INTO `user`(id, username, avatar, position, score)
VALUES (1, 'KimZing', '/static/avatar.png', 'Java高级', 123),
       (2, 'Jasmine', '/static/avatar2.png', '女神', 234),
       (3, '小金', '/static/avatar.png', '架构师', 32423);

INSERT
INTO `article`(id, author_id, title, content, images, classify, mode, read_count)
VALUES (1, 1, "Java从入门到精通然后到放弃", '
\n\t\t\t\t\t\t	<div class="cl-preview-section"><p>大家好，我是风间影月，慕课网<a href="https://class.imooc.com/sale/javaarchitect?mc_marking=c6615303b3175f848fccdb52abb833ec&mc_channel=shouji">《Java架构师成长直通车》</a>课程架构师讲师团成员之一。这篇文章我们一起来聊一聊疫情风险管理。</p>
</div><div class="cl-preview-section"><h3>引子</h3>
</div><div class="cl-preview-section"><p>相信大家都经历了疫情，在疫情之下，企业推迟复工，多地封城封路，各行各业都收到了冲击，甚至很多企业都因此倒闭，那么在企业项目管理中，有一点我们需要把控的就是风险管理，遇到风险如何更好的去调控，把损失降低。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w677" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>作为项目经理，应该如何面对，如何处理，如何协调资源，这些都是作为一名PM所需要去考虑的。</p>
</div><div class="cl-preview-section"><p>当各个企业收到延长春节并延迟复工的消息以后，很多企业的项目都停止了，无法正常运作，尤其是一些传统企业收到的打击最大，比如线下物流，工厂等，而互联网企业相对好一些，项目都是在线的，而且大家可以在家远程办公就能整合到一起。（像我们的线下物流就完全停了，对接的工厂端也完全停了，工厂停了，环境监测系统也用不着了，一连串的连带效应）<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w638" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>其实不论线上还是线下，项目进度肯定会延期，资源成本提升，这么一来很多项目都是亏本的，甚至还会因为合同而赔钱。那么这个时候项目就应该不能按照原计划进行，而需要适当进行变更，因为这是外部的不可抗力的因素。项目经理首先最要考虑的就是干系人管理，尤其是你的客户，管理客户，打好招呼，伺候好，维护好现有关系，那么项目上的后续事宜可以更好的开展。</p>
</div><div class="cl-preview-section"><h3>认清风险</h3>
</div><div class="cl-preview-section"><p>一般项目初期在规划项目编撰合同的时候，相关的风险都应该去有所考虑以及有应对的预案，举几个最简单的例子：</p>
</div><div class="cl-preview-section"><ul><li>项目开展过程中人员流动或者疾病风险
<ul><li>招储备人员（外包公司叫做on bench）</li>
<li>激励政策，也就是TeamBuilding，团队融洽度，每月一次TB，每季度一次项目分红（我们是1500/人）</li>
</ul></li>
<li>服务器/硬件设备风险
<ul><li>自建机房要有容灾预案</li>
<li>云服务器要有多地主备</li>
</ul></li>
<li>成本风险
<ul><li>项目中涉及到的采购供应，成本管理需要做好，预算多少，会否超支，有没有可能因为投入越来越多而导致项目亏损，或者盈利不多，需要提前规划和准备。</li>
</ul></li>
<li>第三方风险
<ul><li>一个项目中可能会有20%-40%甚至更多的内容会外包给第三方公司，第三方有没有可能跑路？资质够不够？可以多找几家对比，或者额外找一家做备胎。又或者找两三家一起合作，不把鸡蛋放在一个篮子里。并且要定期验收，定期检查质量。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w911" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><p>那么像这次疫情，不能归类为普通的风险，应该定性为<code>不可抗力风险</code>，因为你预测不到，而且有时候政府的一个突发性政策就会导致项目无法进行（比如我们的物流项目，和政策息息相关，所以我们很多高层每个季度都要去相关部门参加各种培训，甚至一些资质认证的考试。从而伪实时的跟着政策走）。所以应该纳入免责条款，所以合同里应该要写清，如果不写清除，会有后期的各种纠纷。就比如你公司被人炸了，被陨石击中了，这些都是外部的不可抗力，一般人还真遇不到。像N年前，有个哥们车子被陨石击中，保险公司不赔，为啥，因为这是不可抗力因素呀！<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w799" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>如果是平时的风险，一般来说PM或者PMO能去把控或者承担风险责任，但是想这次疫情对所有企业的袭击，就会上升到企业层面，由企业来承当整个公司的风险后果，所有高层都应该出来协调各方项目资源、项目整合、与项目管理。为什么要这么做，这个其实就是统一整合式管理，因为所有的项目全部受影响，就需要统一的整合了，保证一致性。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w764" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>审查风险</h3>
</div><div class="cl-preview-section"><p>分析在这次风险中的各个环节，对比原有计划所存在的出入点。比如：</p>
</div><div class="cl-preview-section"><ul><li>特殊物流运输会减少流量
<ul><li>工厂需求减少</li>
<li>大型物流车停滞所产生的消耗费（一天不开车，每辆亏损上千）</li>
</ul></li>
<li>交通管制导致原有特殊导航系统不可用，油费额外增多</li>
<li>员工需要自我14天隔离的费用</li>
<li>每日口罩成本损耗</li>
<li>远程办公可能会带来的额外成本
<ul><li>微信视频会议等都免费</li>
<li>国外的一些团队协作工具收费<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w600" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><h3>应对风险</h3>
</div><div class="cl-preview-section"><p>不管遇到任何风险，第一个要做的就是上报，注意，不要越级上报，你是PM，你上面有PMO，所要先汇报给PMO，如果没有PMO就汇报给你的直属经理，比如部门经理或者部门总监。在这个过程中，要响应政府号召，比如排查啊隔离啥的，每日体温测量，人员动向，如果有异常情况，也要及时上报。那么作为项目经理，就需要根据实际情况来适当调整原项目进度计划，适当延后，和参与的相关干系人讨论方案，与客户协调沟通。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w701" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>随后，你要看风险是否可控，是否可以规避，常规的你的下属要离职，那么你就去谈谈，能不能挽留，能不能协调公司资源给他涨薪，了解其诉求，解决其诉求。如果是一些额外成本费用，那么可能还是需要通过上报批准，当然如果小成本你要自己解决也行。像这次疫情，对于一些不可继续的项目，只能停止复工，往后延期延迟，硬着头皮偷偷上一旦被查会承担一些法律责任。比如我们有很多车队因为交通管制无法上路，每天每辆车的停车费用有很多，需要和司机和管理处协调，谈判能否降低停车成本，降低企业成本。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w679" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第三，转移风险，降低风险影响，一般来说就是弥补，最常见的就是保险业务。我们每辆车都投了巨大的保额，为啥？因为全国这么多车，一旦发生车祸，人员伤亡，你都处理不过来，这个时候就需要有保险的介入，以此把风险转移给保险公司，以最小的时间人力成本来降低风险。那么对于这次疫情，作为PM，需要回顾一下所有的实体资源，看看是否有一些保险可以弥补一定的损失。我们审查以后，对于司机的健康保险是可以有一定的弥补的，有总比没有好。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w603" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第四，主动降低风险，这个其实很简单，就是响应号召，戴口罩，少出门，勤洗手，多消毒，降低自身感染病毒的风险。</p>
</div><div class="cl-preview-section"><p>第五，接受风险，这个分为主动和被动之分：</p>
</div><div class="cl-preview-section"><ul><li>主动：实行远程办公，线上的一些项目都可以采取这种方式，互联网企业是较多的，还有一些自媒体啥的，这些完全可以在家里办公，而且可以利用远程协作工具来开展团队管理。但是也要注意，PM要每天定时跟踪每位团队成员的健康度，比如测量体温，观察身体异常。</li>
<li>被动：这个就没办法了，线下的传统企业几乎都栽进去了，我们必须响应号召，延迟复工，工厂不得开，要开也要得报备审查。如果不行只能停止运作。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w683" style="width:100%;"></li>
</ul></div><div class="cl-preview-section"><p>第六，要提交应急风险变更通知，因为项目整体肯定会受到影响，所以原计划是肯定要做出变动的，比如最大的成本开支，以及预算，都要跟着市场资源做变动，变动了才能有效调控。如果资源没有，或者成本实在太高，影响项目利润，那么就只能暂缓延迟。</p>
</div><div class="cl-preview-section"><h3>不可抗力的风险能否免责</h3>
</div><div class="cl-preview-section"><p>对于类似的不可抗力风险，造成项目滞后，成本超支，项目亏损，企业亏损，能不能获得一定的索赔呢？</p>
</div><div class="cl-preview-section"><p>对于合同规定，是有不可抗力因素的，如果因为这次疫情，是可以免除部分或者全部的责任，比如常规的，延期赔偿100万，那么这个时候100万完全可以免责。合同双方不能对彼此提出索赔等要求。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w1015" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>疫情后的市场机遇</h3>
</div><div class="cl-preview-section"><p>疫情带来巨大影响，也会带来更大的机遇，比如说把一些线下的发展为线上的：</p>
</div><div class="cl-preview-section"><ul><li>游戏
<ul><li>这没啥好说的，不管啥时候都很火，在家没事天天打游戏。</li>
</ul></li>
<li>在线医生
<ul><li>遇到问题，线上诊断，小毛病自己解决，大毛病还是去医院</li>
</ul></li>
<li>社区电商
<ul><li>很多人不出去买菜，有些社区电商崛起了，我朋友从送菜的变成了总代理，吊炸天</li>
</ul></li>
<li>短视频
<ul><li>几亿人的娱乐场所，爸爸妈妈们的茶余饭后</li>
</ul></li>
<li>在线教育
<ul><li>正所谓停课不停学，不去学校上课，老师们在直播间互动啊</li>
</ul></li>
<li>健康管家，生物科学
<ul><li>比如苹果的健康应用，可以检测你的心率啊呼吸啊啥的，如果有问题会提醒你，甚至在你遇到危机的时候自动拨号求救。</li>
</ul></li>
<li>远程办公，异地办公
<ul><li>这个不用多说了，很多人都在家办公，开会、培训，团队协作少不了。</li>
<li>异地办公，这个是长期在家，很多国外公司就是这样，甚至员工分布在各国，每年去总部一次的，也有。</li>
</ul></li>
</ul></div>
\n\t\t\t\t\t\t', "/static/demo-normal.png,/static/demo-normal.png,/static/demo-normal.png",
        'Java,后端', 'basic', 100),
       (2, 2, "Go从入门到精通", '
\n\t\t\t\t\t\t	<div class="cl-preview-section"><p>大家好，我是风间影月，慕课网<a href="https://class.imooc.com/sale/javaarchitect?mc_marking=c6615303b3175f848fccdb52abb833ec&mc_channel=shouji">《Java架构师成长直通车》</a>课程架构师讲师团成员之一。这篇文章我们一起来聊一聊疫情风险管理。</p>
</div><div class="cl-preview-section"><h3>引子</h3>
</div><div class="cl-preview-section"><p>相信大家都经历了疫情，在疫情之下，企业推迟复工，多地封城封路，各行各业都收到了冲击，甚至很多企业都因此倒闭，那么在企业项目管理中，有一点我们需要把控的就是风险管理，遇到风险如何更好的去调控，把损失降低。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w677" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>作为项目经理，应该如何面对，如何处理，如何协调资源，这些都是作为一名PM所需要去考虑的。</p>
</div><div class="cl-preview-section"><p>当各个企业收到延长春节并延迟复工的消息以后，很多企业的项目都停止了，无法正常运作，尤其是一些传统企业收到的打击最大，比如线下物流，工厂等，而互联网企业相对好一些，项目都是在线的，而且大家可以在家远程办公就能整合到一起。（像我们的线下物流就完全停了，对接的工厂端也完全停了，工厂停了，环境监测系统也用不着了，一连串的连带效应）<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w638" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>其实不论线上还是线下，项目进度肯定会延期，资源成本提升，这么一来很多项目都是亏本的，甚至还会因为合同而赔钱。那么这个时候项目就应该不能按照原计划进行，而需要适当进行变更，因为这是外部的不可抗力的因素。项目经理首先最要考虑的就是干系人管理，尤其是你的客户，管理客户，打好招呼，伺候好，维护好现有关系，那么项目上的后续事宜可以更好的开展。</p>
</div><div class="cl-preview-section"><h3>认清风险</h3>
</div><div class="cl-preview-section"><p>一般项目初期在规划项目编撰合同的时候，相关的风险都应该去有所考虑以及有应对的预案，举几个最简单的例子：</p>
</div><div class="cl-preview-section"><ul><li>项目开展过程中人员流动或者疾病风险
<ul><li>招储备人员（外包公司叫做on bench）</li>
<li>激励政策，也就是TeamBuilding，团队融洽度，每月一次TB，每季度一次项目分红（我们是1500/人）</li>
</ul></li>
<li>服务器/硬件设备风险
<ul><li>自建机房要有容灾预案</li>
<li>云服务器要有多地主备</li>
</ul></li>
<li>成本风险
<ul><li>项目中涉及到的采购供应，成本管理需要做好，预算多少，会否超支，有没有可能因为投入越来越多而导致项目亏损，或者盈利不多，需要提前规划和准备。</li>
</ul></li>
<li>第三方风险
<ul><li>一个项目中可能会有20%-40%甚至更多的内容会外包给第三方公司，第三方有没有可能跑路？资质够不够？可以多找几家对比，或者额外找一家做备胎。又或者找两三家一起合作，不把鸡蛋放在一个篮子里。并且要定期验收，定期检查质量。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w911" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><p>那么像这次疫情，不能归类为普通的风险，应该定性为<code>不可抗力风险</code>，因为你预测不到，而且有时候政府的一个突发性政策就会导致项目无法进行（比如我们的物流项目，和政策息息相关，所以我们很多高层每个季度都要去相关部门参加各种培训，甚至一些资质认证的考试。从而伪实时的跟着政策走）。所以应该纳入免责条款，所以合同里应该要写清，如果不写清除，会有后期的各种纠纷。就比如你公司被人炸了，被陨石击中了，这些都是外部的不可抗力，一般人还真遇不到。像N年前，有个哥们车子被陨石击中，保险公司不赔，为啥，因为这是不可抗力因素呀！<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w799" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>如果是平时的风险，一般来说PM或者PMO能去把控或者承担风险责任，但是想这次疫情对所有企业的袭击，就会上升到企业层面，由企业来承当整个公司的风险后果，所有高层都应该出来协调各方项目资源、项目整合、与项目管理。为什么要这么做，这个其实就是统一整合式管理，因为所有的项目全部受影响，就需要统一的整合了，保证一致性。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w764" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>审查风险</h3>
</div><div class="cl-preview-section"><p>分析在这次风险中的各个环节，对比原有计划所存在的出入点。比如：</p>
</div><div class="cl-preview-section"><ul><li>特殊物流运输会减少流量
<ul><li>工厂需求减少</li>
<li>大型物流车停滞所产生的消耗费（一天不开车，每辆亏损上千）</li>
</ul></li>
<li>交通管制导致原有特殊导航系统不可用，油费额外增多</li>
<li>员工需要自我14天隔离的费用</li>
<li>每日口罩成本损耗</li>
<li>远程办公可能会带来的额外成本
<ul><li>微信视频会议等都免费</li>
<li>国外的一些团队协作工具收费<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w600" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><h3>应对风险</h3>
</div><div class="cl-preview-section"><p>不管遇到任何风险，第一个要做的就是上报，注意，不要越级上报，你是PM，你上面有PMO，所要先汇报给PMO，如果没有PMO就汇报给你的直属经理，比如部门经理或者部门总监。在这个过程中，要响应政府号召，比如排查啊隔离啥的，每日体温测量，人员动向，如果有异常情况，也要及时上报。那么作为项目经理，就需要根据实际情况来适当调整原项目进度计划，适当延后，和参与的相关干系人讨论方案，与客户协调沟通。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w701" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>随后，你要看风险是否可控，是否可以规避，常规的你的下属要离职，那么你就去谈谈，能不能挽留，能不能协调公司资源给他涨薪，了解其诉求，解决其诉求。如果是一些额外成本费用，那么可能还是需要通过上报批准，当然如果小成本你要自己解决也行。像这次疫情，对于一些不可继续的项目，只能停止复工，往后延期延迟，硬着头皮偷偷上一旦被查会承担一些法律责任。比如我们有很多车队因为交通管制无法上路，每天每辆车的停车费用有很多，需要和司机和管理处协调，谈判能否降低停车成本，降低企业成本。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w679" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第三，转移风险，降低风险影响，一般来说就是弥补，最常见的就是保险业务。我们每辆车都投了巨大的保额，为啥？因为全国这么多车，一旦发生车祸，人员伤亡，你都处理不过来，这个时候就需要有保险的介入，以此把风险转移给保险公司，以最小的时间人力成本来降低风险。那么对于这次疫情，作为PM，需要回顾一下所有的实体资源，看看是否有一些保险可以弥补一定的损失。我们审查以后，对于司机的健康保险是可以有一定的弥补的，有总比没有好。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w603" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第四，主动降低风险，这个其实很简单，就是响应号召，戴口罩，少出门，勤洗手，多消毒，降低自身感染病毒的风险。</p>
</div><div class="cl-preview-section"><p>第五，接受风险，这个分为主动和被动之分：</p>
</div><div class="cl-preview-section"><ul><li>主动：实行远程办公，线上的一些项目都可以采取这种方式，互联网企业是较多的，还有一些自媒体啥的，这些完全可以在家里办公，而且可以利用远程协作工具来开展团队管理。但是也要注意，PM要每天定时跟踪每位团队成员的健康度，比如测量体温，观察身体异常。</li>
<li>被动：这个就没办法了，线下的传统企业几乎都栽进去了，我们必须响应号召，延迟复工，工厂不得开，要开也要得报备审查。如果不行只能停止运作。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w683" style="width:100%;"></li>
</ul></div><div class="cl-preview-section"><p>第六，要提交应急风险变更通知，因为项目整体肯定会受到影响，所以原计划是肯定要做出变动的，比如最大的成本开支，以及预算，都要跟着市场资源做变动，变动了才能有效调控。如果资源没有，或者成本实在太高，影响项目利润，那么就只能暂缓延迟。</p>
</div><div class="cl-preview-section"><h3>不可抗力的风险能否免责</h3>
</div><div class="cl-preview-section"><p>对于类似的不可抗力风险，造成项目滞后，成本超支，项目亏损，企业亏损，能不能获得一定的索赔呢？</p>
</div><div class="cl-preview-section"><p>对于合同规定，是有不可抗力因素的，如果因为这次疫情，是可以免除部分或者全部的责任，比如常规的，延期赔偿100万，那么这个时候100万完全可以免责。合同双方不能对彼此提出索赔等要求。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w1015" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>疫情后的市场机遇</h3>
</div><div class="cl-preview-section"><p>疫情带来巨大影响，也会带来更大的机遇，比如说把一些线下的发展为线上的：</p>
</div><div class="cl-preview-section"><ul><li>游戏
<ul><li>这没啥好说的，不管啥时候都很火，在家没事天天打游戏。</li>
</ul></li>
<li>在线医生
<ul><li>遇到问题，线上诊断，小毛病自己解决，大毛病还是去医院</li>
</ul></li>
<li>社区电商
<ul><li>很多人不出去买菜，有些社区电商崛起了，我朋友从送菜的变成了总代理，吊炸天</li>
</ul></li>
<li>短视频
<ul><li>几亿人的娱乐场所，爸爸妈妈们的茶余饭后</li>
</ul></li>
<li>在线教育
<ul><li>正所谓停课不停学，不去学校上课，老师们在直播间互动啊</li>
</ul></li>
<li>健康管家，生物科学
<ul><li>比如苹果的健康应用，可以检测你的心率啊呼吸啊啥的，如果有问题会提醒你，甚至在你遇到危机的时候自动拨号求救。</li>
</ul></li>
<li>远程办公，异地办公
<ul><li>这个不用多说了，很多人都在家办公，开会、培训，团队协作少不了。</li>
<li>异地办公，这个是长期在家，很多国外公司就是这样，甚至员工分布在各国，每年去总部一次的，也有。</li>
</ul></li>
</ul></div>
\n\t\t\t\t\t\t',
        "/static/demo-normal.png,/static/demo-normal.png,/static/demo-normal.png,/static/demo-normal.png", 'Go,后端',
        'multi', 200),
       (3, 3, "Python从入门到精通", '\n\t\t\t\t\t\t<div class="cl-preview-section"><p>大家好，我是风间影月，慕课网<a href="https://class.imooc.com/sale/javaarchitect?mc_marking=c6615303b3175f848fccdb52abb833ec&mc_channel=shouji">《Java架构师成长直通车》</a>课程架构师讲师团成员之一。这篇文章我们一起来聊一聊疫情风险管理。</p>
</div><div class="cl-preview-section"><h3>引子</h3>
</div><div class="cl-preview-section"><p>相信大家都经历了疫情，在疫情之下，企业推迟复工，多地封城封路，各行各业都收到了冲击，甚至很多企业都因此倒闭，那么在企业项目管理中，有一点我们需要把控的就是风险管理，遇到风险如何更好的去调控，把损失降低。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w677" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>作为项目经理，应该如何面对，如何处理，如何协调资源，这些都是作为一名PM所需要去考虑的。</p>
</div><div class="cl-preview-section"><p>当各个企业收到延长春节并延迟复工的消息以后，很多企业的项目都停止了，无法正常运作，尤其是一些传统企业收到的打击最大，比如线下物流，工厂等，而互联网企业相对好一些，项目都是在线的，而且大家可以在家远程办公就能整合到一起。（像我们的线下物流就完全停了，对接的工厂端也完全停了，工厂停了，环境监测系统也用不着了，一连串的连带效应）<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w638" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>其实不论线上还是线下，项目进度肯定会延期，资源成本提升，这么一来很多项目都是亏本的，甚至还会因为合同而赔钱。那么这个时候项目就应该不能按照原计划进行，而需要适当进行变更，因为这是外部的不可抗力的因素。项目经理首先最要考虑的就是干系人管理，尤其是你的客户，管理客户，打好招呼，伺候好，维护好现有关系，那么项目上的后续事宜可以更好的开展。</p>
</div><div class="cl-preview-section"><h3>认清风险</h3>
</div><div class="cl-preview-section"><p>一般项目初期在规划项目编撰合同的时候，相关的风险都应该去有所考虑以及有应对的预案，举几个最简单的例子：</p>
</div><div class="cl-preview-section"><ul><li>项目开展过程中人员流动或者疾病风险
<ul><li>招储备人员（外包公司叫做on bench）</li>
<li>激励政策，也就是TeamBuilding，团队融洽度，每月一次TB，每季度一次项目分红（我们是1500/人）</li>
</ul></li>
<li>服务器/硬件设备风险
<ul><li>自建机房要有容灾预案</li>
<li>云服务器要有多地主备</li>
</ul></li>
<li>成本风险
<ul><li>项目中涉及到的采购供应，成本管理需要做好，预算多少，会否超支，有没有可能因为投入越来越多而导致项目亏损，或者盈利不多，需要提前规划和准备。</li>
</ul></li>
<li>第三方风险
<ul><li>一个项目中可能会有20%-40%甚至更多的内容会外包给第三方公司，第三方有没有可能跑路？资质够不够？可以多找几家对比，或者额外找一家做备胎。又或者找两三家一起合作，不把鸡蛋放在一个篮子里。并且要定期验收，定期检查质量。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w911" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><p>那么像这次疫情，不能归类为普通的风险，应该定性为<code>不可抗力风险</code>，因为你预测不到，而且有时候政府的一个突发性政策就会导致项目无法进行（比如我们的物流项目，和政策息息相关，所以我们很多高层每个季度都要去相关部门参加各种培训，甚至一些资质认证的考试。从而伪实时的跟着政策走）。所以应该纳入免责条款，所以合同里应该要写清，如果不写清除，会有后期的各种纠纷。就比如你公司被人炸了，被陨石击中了，这些都是外部的不可抗力，一般人还真遇不到。像N年前，有个哥们车子被陨石击中，保险公司不赔，为啥，因为这是不可抗力因素呀！<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w799" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>如果是平时的风险，一般来说PM或者PMO能去把控或者承担风险责任，但是想这次疫情对所有企业的袭击，就会上升到企业层面，由企业来承当整个公司的风险后果，所有高层都应该出来协调各方项目资源、项目整合、与项目管理。为什么要这么做，这个其实就是统一整合式管理，因为所有的项目全部受影响，就需要统一的整合了，保证一致性。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w764" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>审查风险</h3>
</div><div class="cl-preview-section"><p>分析在这次风险中的各个环节，对比原有计划所存在的出入点。比如：</p>
</div><div class="cl-preview-section"><ul><li>特殊物流运输会减少流量
<ul><li>工厂需求减少</li>
<li>大型物流车停滞所产生的消耗费（一天不开车，每辆亏损上千）</li>
</ul></li>
<li>交通管制导致原有特殊导航系统不可用，油费额外增多</li>
<li>员工需要自我14天隔离的费用</li>
<li>每日口罩成本损耗</li>
<li>远程办公可能会带来的额外成本
<ul><li>微信视频会议等都免费</li>
<li>国外的一些团队协作工具收费<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w600" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><h3>应对风险</h3>
</div><div class="cl-preview-section"><p>不管遇到任何风险，第一个要做的就是上报，注意，不要越级上报，你是PM，你上面有PMO，所要先汇报给PMO，如果没有PMO就汇报给你的直属经理，比如部门经理或者部门总监。在这个过程中，要响应政府号召，比如排查啊隔离啥的，每日体温测量，人员动向，如果有异常情况，也要及时上报。那么作为项目经理，就需要根据实际情况来适当调整原项目进度计划，适当延后，和参与的相关干系人讨论方案，与客户协调沟通。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w701" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>随后，你要看风险是否可控，是否可以规避，常规的你的下属要离职，那么你就去谈谈，能不能挽留，能不能协调公司资源给他涨薪，了解其诉求，解决其诉求。如果是一些额外成本费用，那么可能还是需要通过上报批准，当然如果小成本你要自己解决也行。像这次疫情，对于一些不可继续的项目，只能停止复工，往后延期延迟，硬着头皮偷偷上一旦被查会承担一些法律责任。比如我们有很多车队因为交通管制无法上路，每天每辆车的停车费用有很多，需要和司机和管理处协调，谈判能否降低停车成本，降低企业成本。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w679" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第三，转移风险，降低风险影响，一般来说就是弥补，最常见的就是保险业务。我们每辆车都投了巨大的保额，为啥？因为全国这么多车，一旦发生车祸，人员伤亡，你都处理不过来，这个时候就需要有保险的介入，以此把风险转移给保险公司，以最小的时间人力成本来降低风险。那么对于这次疫情，作为PM，需要回顾一下所有的实体资源，看看是否有一些保险可以弥补一定的损失。我们审查以后，对于司机的健康保险是可以有一定的弥补的，有总比没有好。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w603" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第四，主动降低风险，这个其实很简单，就是响应号召，戴口罩，少出门，勤洗手，多消毒，降低自身感染病毒的风险。</p>
</div><div class="cl-preview-section"><p>第五，接受风险，这个分为主动和被动之分：</p>
</div><div class="cl-preview-section"><ul><li>主动：实行远程办公，线上的一些项目都可以采取这种方式，互联网企业是较多的，还有一些自媒体啥的，这些完全可以在家里办公，而且可以利用远程协作工具来开展团队管理。但是也要注意，PM要每天定时跟踪每位团队成员的健康度，比如测量体温，观察身体异常。</li>
<li>被动：这个就没办法了，线下的传统企业几乎都栽进去了，我们必须响应号召，延迟复工，工厂不得开，要开也要得报备审查。如果不行只能停止运作。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w683" style="width:100%;"></li>
</ul></div><div class="cl-preview-section"><p>第六，要提交应急风险变更通知，因为项目整体肯定会受到影响，所以原计划是肯定要做出变动的，比如最大的成本开支，以及预算，都要跟着市场资源做变动，变动了才能有效调控。如果资源没有，或者成本实在太高，影响项目利润，那么就只能暂缓延迟。</p>
</div><div class="cl-preview-section"><h3>不可抗力的风险能否免责</h3>
</div><div class="cl-preview-section"><p>对于类似的不可抗力风险，造成项目滞后，成本超支，项目亏损，企业亏损，能不能获得一定的索赔呢？</p>
</div><div class="cl-preview-section"><p>对于合同规定，是有不可抗力因素的，如果因为这次疫情，是可以免除部分或者全部的责任，比如常规的，延期赔偿100万，那么这个时候100万完全可以免责。合同双方不能对彼此提出索赔等要求。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w1015" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>疫情后的市场机遇</h3>
</div><div class="cl-preview-section"><p>疫情带来巨大影响，也会带来更大的机遇，比如说把一些线下的发展为线上的：</p>
</div><div class="cl-preview-section"><ul><li>游戏
<ul><li>这没啥好说的，不管啥时候都很火，在家没事天天打游戏。</li>
</ul></li>
<li>在线医生
<ul><li>遇到问题，线上诊断，小毛病自己解决，大毛病还是去医院</li>
</ul></li>
<li>社区电商
<ul><li>很多人不出去买菜，有些社区电商崛起了，我朋友从送菜的变成了总代理，吊炸天</li>
</ul></li>
<li>短视频
<ul><li>几亿人的娱乐场所，爸爸妈妈们的茶余饭后</li>
</ul></li>
<li>在线教育
<ul><li>正所谓停课不停学，不去学校上课，老师们在直播间互动啊</li>
</ul></li>
<li>健康管家，生物科学
<ul><li>比如苹果的健康应用，可以检测你的心率啊呼吸啊啥的，如果有问题会提醒你，甚至在你遇到危机的时候自动拨号求救。</li>
</ul></li>
<li>远程办公，异地办公
<ul><li>这个不用多说了，很多人都在家办公，开会、培训，团队协作少不了。</li>
<li>异地办公，这个是长期在家，很多国外公司就是这样，甚至员工分布在各国，每年去总部一次的，也有。</li>
</ul></li>
</ul></div>\n\t\t\t\t\t\t', "/static/demo-normal.png,/static/demo-normal.png", '后端,Python', 'basic', 300),
       (4, 1, "UniApp从入门到精通", '\n\t\t\t\t\t\t<div class="cl-preview-section"><p>大家好，我是风间影月，慕课网<a href="https://class.imooc.com/sale/javaarchitect?mc_marking=c6615303b3175f848fccdb52abb833ec&mc_channel=shouji">《Java架构师成长直通车》</a>课程架构师讲师团成员之一。这篇文章我们一起来聊一聊疫情风险管理。</p>
</div><div class="cl-preview-section"><h3>引子</h3>
</div><div class="cl-preview-section"><p>相信大家都经历了疫情，在疫情之下，企业推迟复工，多地封城封路，各行各业都收到了冲击，甚至很多企业都因此倒闭，那么在企业项目管理中，有一点我们需要把控的就是风险管理，遇到风险如何更好的去调控，把损失降低。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w677" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>作为项目经理，应该如何面对，如何处理，如何协调资源，这些都是作为一名PM所需要去考虑的。</p>
</div><div class="cl-preview-section"><p>当各个企业收到延长春节并延迟复工的消息以后，很多企业的项目都停止了，无法正常运作，尤其是一些传统企业收到的打击最大，比如线下物流，工厂等，而互联网企业相对好一些，项目都是在线的，而且大家可以在家远程办公就能整合到一起。（像我们的线下物流就完全停了，对接的工厂端也完全停了，工厂停了，环境监测系统也用不着了，一连串的连带效应）<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w638" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>其实不论线上还是线下，项目进度肯定会延期，资源成本提升，这么一来很多项目都是亏本的，甚至还会因为合同而赔钱。那么这个时候项目就应该不能按照原计划进行，而需要适当进行变更，因为这是外部的不可抗力的因素。项目经理首先最要考虑的就是干系人管理，尤其是你的客户，管理客户，打好招呼，伺候好，维护好现有关系，那么项目上的后续事宜可以更好的开展。</p>
</div><div class="cl-preview-section"><h3>认清风险</h3>
</div><div class="cl-preview-section"><p>一般项目初期在规划项目编撰合同的时候，相关的风险都应该去有所考虑以及有应对的预案，举几个最简单的例子：</p>
</div><div class="cl-preview-section"><ul><li>项目开展过程中人员流动或者疾病风险
<ul><li>招储备人员（外包公司叫做on bench）</li>
<li>激励政策，也就是TeamBuilding，团队融洽度，每月一次TB，每季度一次项目分红（我们是1500/人）</li>
</ul></li>
<li>服务器/硬件设备风险
<ul><li>自建机房要有容灾预案</li>
<li>云服务器要有多地主备</li>
</ul></li>
<li>成本风险
<ul><li>项目中涉及到的采购供应，成本管理需要做好，预算多少，会否超支，有没有可能因为投入越来越多而导致项目亏损，或者盈利不多，需要提前规划和准备。</li>
</ul></li>
<li>第三方风险
<ul><li>一个项目中可能会有20%-40%甚至更多的内容会外包给第三方公司，第三方有没有可能跑路？资质够不够？可以多找几家对比，或者额外找一家做备胎。又或者找两三家一起合作，不把鸡蛋放在一个篮子里。并且要定期验收，定期检查质量。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w911" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><p>那么像这次疫情，不能归类为普通的风险，应该定性为<code>不可抗力风险</code>，因为你预测不到，而且有时候政府的一个突发性政策就会导致项目无法进行（比如我们的物流项目，和政策息息相关，所以我们很多高层每个季度都要去相关部门参加各种培训，甚至一些资质认证的考试。从而伪实时的跟着政策走）。所以应该纳入免责条款，所以合同里应该要写清，如果不写清除，会有后期的各种纠纷。就比如你公司被人炸了，被陨石击中了，这些都是外部的不可抗力，一般人还真遇不到。像N年前，有个哥们车子被陨石击中，保险公司不赔，为啥，因为这是不可抗力因素呀！<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w799" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>如果是平时的风险，一般来说PM或者PMO能去把控或者承担风险责任，但是想这次疫情对所有企业的袭击，就会上升到企业层面，由企业来承当整个公司的风险后果，所有高层都应该出来协调各方项目资源、项目整合、与项目管理。为什么要这么做，这个其实就是统一整合式管理，因为所有的项目全部受影响，就需要统一的整合了，保证一致性。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w764" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>审查风险</h3>
</div><div class="cl-preview-section"><p>分析在这次风险中的各个环节，对比原有计划所存在的出入点。比如：</p>
</div><div class="cl-preview-section"><ul><li>特殊物流运输会减少流量
<ul><li>工厂需求减少</li>
<li>大型物流车停滞所产生的消耗费（一天不开车，每辆亏损上千）</li>
</ul></li>
<li>交通管制导致原有特殊导航系统不可用，油费额外增多</li>
<li>员工需要自我14天隔离的费用</li>
<li>每日口罩成本损耗</li>
<li>远程办公可能会带来的额外成本
<ul><li>微信视频会议等都免费</li>
<li>国外的一些团队协作工具收费<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w600" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><h3>应对风险</h3>
</div><div class="cl-preview-section"><p>不管遇到任何风险，第一个要做的就是上报，注意，不要越级上报，你是PM，你上面有PMO，所要先汇报给PMO，如果没有PMO就汇报给你的直属经理，比如部门经理或者部门总监。在这个过程中，要响应政府号召，比如排查啊隔离啥的，每日体温测量，人员动向，如果有异常情况，也要及时上报。那么作为项目经理，就需要根据实际情况来适当调整原项目进度计划，适当延后，和参与的相关干系人讨论方案，与客户协调沟通。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w701" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>随后，你要看风险是否可控，是否可以规避，常规的你的下属要离职，那么你就去谈谈，能不能挽留，能不能协调公司资源给他涨薪，了解其诉求，解决其诉求。如果是一些额外成本费用，那么可能还是需要通过上报批准，当然如果小成本你要自己解决也行。像这次疫情，对于一些不可继续的项目，只能停止复工，往后延期延迟，硬着头皮偷偷上一旦被查会承担一些法律责任。比如我们有很多车队因为交通管制无法上路，每天每辆车的停车费用有很多，需要和司机和管理处协调，谈判能否降低停车成本，降低企业成本。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w679" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第三，转移风险，降低风险影响，一般来说就是弥补，最常见的就是保险业务。我们每辆车都投了巨大的保额，为啥？因为全国这么多车，一旦发生车祸，人员伤亡，你都处理不过来，这个时候就需要有保险的介入，以此把风险转移给保险公司，以最小的时间人力成本来降低风险。那么对于这次疫情，作为PM，需要回顾一下所有的实体资源，看看是否有一些保险可以弥补一定的损失。我们审查以后，对于司机的健康保险是可以有一定的弥补的，有总比没有好。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w603" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第四，主动降低风险，这个其实很简单，就是响应号召，戴口罩，少出门，勤洗手，多消毒，降低自身感染病毒的风险。</p>
</div><div class="cl-preview-section"><p>第五，接受风险，这个分为主动和被动之分：</p>
</div><div class="cl-preview-section"><ul><li>主动：实行远程办公，线上的一些项目都可以采取这种方式，互联网企业是较多的，还有一些自媒体啥的，这些完全可以在家里办公，而且可以利用远程协作工具来开展团队管理。但是也要注意，PM要每天定时跟踪每位团队成员的健康度，比如测量体温，观察身体异常。</li>
<li>被动：这个就没办法了，线下的传统企业几乎都栽进去了，我们必须响应号召，延迟复工，工厂不得开，要开也要得报备审查。如果不行只能停止运作。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w683" style="width:100%;"></li>
</ul></div><div class="cl-preview-section"><p>第六，要提交应急风险变更通知，因为项目整体肯定会受到影响，所以原计划是肯定要做出变动的，比如最大的成本开支，以及预算，都要跟着市场资源做变动，变动了才能有效调控。如果资源没有，或者成本实在太高，影响项目利润，那么就只能暂缓延迟。</p>
</div><div class="cl-preview-section"><h3>不可抗力的风险能否免责</h3>
</div><div class="cl-preview-section"><p>对于类似的不可抗力风险，造成项目滞后，成本超支，项目亏损，企业亏损，能不能获得一定的索赔呢？</p>
</div><div class="cl-preview-section"><p>对于合同规定，是有不可抗力因素的，如果因为这次疫情，是可以免除部分或者全部的责任，比如常规的，延期赔偿100万，那么这个时候100万完全可以免责。合同双方不能对彼此提出索赔等要求。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w1015" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>疫情后的市场机遇</h3>
</div><div class="cl-preview-section"><p>疫情带来巨大影响，也会带来更大的机遇，比如说把一些线下的发展为线上的：</p>
</div><div class="cl-preview-section"><ul><li>游戏
<ul><li>这没啥好说的，不管啥时候都很火，在家没事天天打游戏。</li>
</ul></li>
<li>在线医生
<ul><li>遇到问题，线上诊断，小毛病自己解决，大毛病还是去医院</li>
</ul></li>
<li>社区电商
<ul><li>很多人不出去买菜，有些社区电商崛起了，我朋友从送菜的变成了总代理，吊炸天</li>
</ul></li>
<li>短视频
<ul><li>几亿人的娱乐场所，爸爸妈妈们的茶余饭后</li>
</ul></li>
<li>在线教育
<ul><li>正所谓停课不停学，不去学校上课，老师们在直播间互动啊</li>
</ul></li>
<li>健康管家，生物科学
<ul><li>比如苹果的健康应用，可以检测你的心率啊呼吸啊啥的，如果有问题会提醒你，甚至在你遇到危机的时候自动拨号求救。</li>
</ul></li>
<li>远程办公，异地办公
<ul><li>这个不用多说了，很多人都在家办公，开会、培训，团队协作少不了。</li>
<li>异地办公，这个是长期在家，很多国外公司就是这样，甚至员工分布在各国，每年去总部一次的，也有。</li>
</ul></li>
</ul></div>\n\t\t\t\t\t\t', "/static/demo-normal.png,/static/demo-normal.png", '前端,UniApp', 'multi',
        1230),
       (5, 1, "前端从入门到精通", '\n\t\t\t\t\t\t<div class="cl-preview-section"><p>大家好，我是风间影月，慕课网<a href="https://class.imooc.com/sale/javaarchitect?mc_marking=c6615303b3175f848fccdb52abb833ec&mc_channel=shouji">《Java架构师成长直通车》</a>课程架构师讲师团成员之一。这篇文章我们一起来聊一聊疫情风险管理。</p>
</div><div class="cl-preview-section"><h3>引子</h3>
</div><div class="cl-preview-section"><p>相信大家都经历了疫情，在疫情之下，企业推迟复工，多地封城封路，各行各业都收到了冲击，甚至很多企业都因此倒闭，那么在企业项目管理中，有一点我们需要把控的就是风险管理，遇到风险如何更好的去调控，把损失降低。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w677" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>作为项目经理，应该如何面对，如何处理，如何协调资源，这些都是作为一名PM所需要去考虑的。</p>
</div><div class="cl-preview-section"><p>当各个企业收到延长春节并延迟复工的消息以后，很多企业的项目都停止了，无法正常运作，尤其是一些传统企业收到的打击最大，比如线下物流，工厂等，而互联网企业相对好一些，项目都是在线的，而且大家可以在家远程办公就能整合到一起。（像我们的线下物流就完全停了，对接的工厂端也完全停了，工厂停了，环境监测系统也用不着了，一连串的连带效应）<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w638" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>其实不论线上还是线下，项目进度肯定会延期，资源成本提升，这么一来很多项目都是亏本的，甚至还会因为合同而赔钱。那么这个时候项目就应该不能按照原计划进行，而需要适当进行变更，因为这是外部的不可抗力的因素。项目经理首先最要考虑的就是干系人管理，尤其是你的客户，管理客户，打好招呼，伺候好，维护好现有关系，那么项目上的后续事宜可以更好的开展。</p>
</div><div class="cl-preview-section"><h3>认清风险</h3>
</div><div class="cl-preview-section"><p>一般项目初期在规划项目编撰合同的时候，相关的风险都应该去有所考虑以及有应对的预案，举几个最简单的例子：</p>
</div><div class="cl-preview-section"><ul><li>项目开展过程中人员流动或者疾病风险
<ul><li>招储备人员（外包公司叫做on bench）</li>
<li>激励政策，也就是TeamBuilding，团队融洽度，每月一次TB，每季度一次项目分红（我们是1500/人）</li>
</ul></li>
<li>服务器/硬件设备风险
<ul><li>自建机房要有容灾预案</li>
<li>云服务器要有多地主备</li>
</ul></li>
<li>成本风险
<ul><li>项目中涉及到的采购供应，成本管理需要做好，预算多少，会否超支，有没有可能因为投入越来越多而导致项目亏损，或者盈利不多，需要提前规划和准备。</li>
</ul></li>
<li>第三方风险
<ul><li>一个项目中可能会有20%-40%甚至更多的内容会外包给第三方公司，第三方有没有可能跑路？资质够不够？可以多找几家对比，或者额外找一家做备胎。又或者找两三家一起合作，不把鸡蛋放在一个篮子里。并且要定期验收，定期检查质量。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w911" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><p>那么像这次疫情，不能归类为普通的风险，应该定性为<code>不可抗力风险</code>，因为你预测不到，而且有时候政府的一个突发性政策就会导致项目无法进行（比如我们的物流项目，和政策息息相关，所以我们很多高层每个季度都要去相关部门参加各种培训，甚至一些资质认证的考试。从而伪实时的跟着政策走）。所以应该纳入免责条款，所以合同里应该要写清，如果不写清除，会有后期的各种纠纷。就比如你公司被人炸了，被陨石击中了，这些都是外部的不可抗力，一般人还真遇不到。像N年前，有个哥们车子被陨石击中，保险公司不赔，为啥，因为这是不可抗力因素呀！<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w799" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>如果是平时的风险，一般来说PM或者PMO能去把控或者承担风险责任，但是想这次疫情对所有企业的袭击，就会上升到企业层面，由企业来承当整个公司的风险后果，所有高层都应该出来协调各方项目资源、项目整合、与项目管理。为什么要这么做，这个其实就是统一整合式管理，因为所有的项目全部受影响，就需要统一的整合了，保证一致性。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w764" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>审查风险</h3>
</div><div class="cl-preview-section"><p>分析在这次风险中的各个环节，对比原有计划所存在的出入点。比如：</p>
</div><div class="cl-preview-section"><ul><li>特殊物流运输会减少流量
<ul><li>工厂需求减少</li>
<li>大型物流车停滞所产生的消耗费（一天不开车，每辆亏损上千）</li>
</ul></li>
<li>交通管制导致原有特殊导航系统不可用，油费额外增多</li>
<li>员工需要自我14天隔离的费用</li>
<li>每日口罩成本损耗</li>
<li>远程办公可能会带来的额外成本
<ul><li>微信视频会议等都免费</li>
<li>国外的一些团队协作工具收费<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w600" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><h3>应对风险</h3>
</div><div class="cl-preview-section"><p>不管遇到任何风险，第一个要做的就是上报，注意，不要越级上报，你是PM，你上面有PMO，所要先汇报给PMO，如果没有PMO就汇报给你的直属经理，比如部门经理或者部门总监。在这个过程中，要响应政府号召，比如排查啊隔离啥的，每日体温测量，人员动向，如果有异常情况，也要及时上报。那么作为项目经理，就需要根据实际情况来适当调整原项目进度计划，适当延后，和参与的相关干系人讨论方案，与客户协调沟通。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w701" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>随后，你要看风险是否可控，是否可以规避，常规的你的下属要离职，那么你就去谈谈，能不能挽留，能不能协调公司资源给他涨薪，了解其诉求，解决其诉求。如果是一些额外成本费用，那么可能还是需要通过上报批准，当然如果小成本你要自己解决也行。像这次疫情，对于一些不可继续的项目，只能停止复工，往后延期延迟，硬着头皮偷偷上一旦被查会承担一些法律责任。比如我们有很多车队因为交通管制无法上路，每天每辆车的停车费用有很多，需要和司机和管理处协调，谈判能否降低停车成本，降低企业成本。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w679" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第三，转移风险，降低风险影响，一般来说就是弥补，最常见的就是保险业务。我们每辆车都投了巨大的保额，为啥？因为全国这么多车，一旦发生车祸，人员伤亡，你都处理不过来，这个时候就需要有保险的介入，以此把风险转移给保险公司，以最小的时间人力成本来降低风险。那么对于这次疫情，作为PM，需要回顾一下所有的实体资源，看看是否有一些保险可以弥补一定的损失。我们审查以后，对于司机的健康保险是可以有一定的弥补的，有总比没有好。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w603" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第四，主动降低风险，这个其实很简单，就是响应号召，戴口罩，少出门，勤洗手，多消毒，降低自身感染病毒的风险。</p>
</div><div class="cl-preview-section"><p>第五，接受风险，这个分为主动和被动之分：</p>
</div><div class="cl-preview-section"><ul><li>主动：实行远程办公，线上的一些项目都可以采取这种方式，互联网企业是较多的，还有一些自媒体啥的，这些完全可以在家里办公，而且可以利用远程协作工具来开展团队管理。但是也要注意，PM要每天定时跟踪每位团队成员的健康度，比如测量体温，观察身体异常。</li>
<li>被动：这个就没办法了，线下的传统企业几乎都栽进去了，我们必须响应号召，延迟复工，工厂不得开，要开也要得报备审查。如果不行只能停止运作。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w683" style="width:100%;"></li>
</ul></div><div class="cl-preview-section"><p>第六，要提交应急风险变更通知，因为项目整体肯定会受到影响，所以原计划是肯定要做出变动的，比如最大的成本开支，以及预算，都要跟着市场资源做变动，变动了才能有效调控。如果资源没有，或者成本实在太高，影响项目利润，那么就只能暂缓延迟。</p>
</div><div class="cl-preview-section"><h3>不可抗力的风险能否免责</h3>
</div><div class="cl-preview-section"><p>对于类似的不可抗力风险，造成项目滞后，成本超支，项目亏损，企业亏损，能不能获得一定的索赔呢？</p>
</div><div class="cl-preview-section"><p>对于合同规定，是有不可抗力因素的，如果因为这次疫情，是可以免除部分或者全部的责任，比如常规的，延期赔偿100万，那么这个时候100万完全可以免责。合同双方不能对彼此提出索赔等要求。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w1015" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>疫情后的市场机遇</h3>
</div><div class="cl-preview-section"><p>疫情带来巨大影响，也会带来更大的机遇，比如说把一些线下的发展为线上的：</p>
</div><div class="cl-preview-section"><ul><li>游戏
<ul><li>这没啥好说的，不管啥时候都很火，在家没事天天打游戏。</li>
</ul></li>
<li>在线医生
<ul><li>遇到问题，线上诊断，小毛病自己解决，大毛病还是去医院</li>
</ul></li>
<li>社区电商
<ul><li>很多人不出去买菜，有些社区电商崛起了，我朋友从送菜的变成了总代理，吊炸天</li>
</ul></li>
<li>短视频
<ul><li>几亿人的娱乐场所，爸爸妈妈们的茶余饭后</li>
</ul></li>
<li>在线教育
<ul><li>正所谓停课不停学，不去学校上课，老师们在直播间互动啊</li>
</ul></li>
<li>健康管家，生物科学
<ul><li>比如苹果的健康应用，可以检测你的心率啊呼吸啊啥的，如果有问题会提醒你，甚至在你遇到危机的时候自动拨号求救。</li>
</ul></li>
<li>远程办公，异地办公
<ul><li>这个不用多说了，很多人都在家办公，开会、培训，团队协作少不了。</li>
<li>异地办公，这个是长期在家，很多国外公司就是这样，甚至员工分布在各国，每年去总部一次的，也有。</li>
</ul></li>
</ul></div>\n\t\t\t\t\t\t', "/static/demo-normal.png,/static/demo-normal.png", '前端', 'basic', 34),
       (6, 1, "后端从入门到精通", '\n\t\t\t\t\t\t<div class="cl-preview-section"><p>大家好，我是风间影月，慕课网<a href="https://class.imooc.com/sale/javaarchitect?mc_marking=c6615303b3175f848fccdb52abb833ec&mc_channel=shouji">《Java架构师成长直通车》</a>课程架构师讲师团成员之一。这篇文章我们一起来聊一聊疫情风险管理。</p>
</div><div class="cl-preview-section"><h3>引子</h3>
</div><div class="cl-preview-section"><p>相信大家都经历了疫情，在疫情之下，企业推迟复工，多地封城封路，各行各业都收到了冲击，甚至很多企业都因此倒闭，那么在企业项目管理中，有一点我们需要把控的就是风险管理，遇到风险如何更好的去调控，把损失降低。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w677" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>作为项目经理，应该如何面对，如何处理，如何协调资源，这些都是作为一名PM所需要去考虑的。</p>
</div><div class="cl-preview-section"><p>当各个企业收到延长春节并延迟复工的消息以后，很多企业的项目都停止了，无法正常运作，尤其是一些传统企业收到的打击最大，比如线下物流，工厂等，而互联网企业相对好一些，项目都是在线的，而且大家可以在家远程办公就能整合到一起。（像我们的线下物流就完全停了，对接的工厂端也完全停了，工厂停了，环境监测系统也用不着了，一连串的连带效应）<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w638" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>其实不论线上还是线下，项目进度肯定会延期，资源成本提升，这么一来很多项目都是亏本的，甚至还会因为合同而赔钱。那么这个时候项目就应该不能按照原计划进行，而需要适当进行变更，因为这是外部的不可抗力的因素。项目经理首先最要考虑的就是干系人管理，尤其是你的客户，管理客户，打好招呼，伺候好，维护好现有关系，那么项目上的后续事宜可以更好的开展。</p>
</div><div class="cl-preview-section"><h3>认清风险</h3>
</div><div class="cl-preview-section"><p>一般项目初期在规划项目编撰合同的时候，相关的风险都应该去有所考虑以及有应对的预案，举几个最简单的例子：</p>
</div><div class="cl-preview-section"><ul><li>项目开展过程中人员流动或者疾病风险
<ul><li>招储备人员（外包公司叫做on bench）</li>
<li>激励政策，也就是TeamBuilding，团队融洽度，每月一次TB，每季度一次项目分红（我们是1500/人）</li>
</ul></li>
<li>服务器/硬件设备风险
<ul><li>自建机房要有容灾预案</li>
<li>云服务器要有多地主备</li>
</ul></li>
<li>成本风险
<ul><li>项目中涉及到的采购供应，成本管理需要做好，预算多少，会否超支，有没有可能因为投入越来越多而导致项目亏损，或者盈利不多，需要提前规划和准备。</li>
</ul></li>
<li>第三方风险
<ul><li>一个项目中可能会有20%-40%甚至更多的内容会外包给第三方公司，第三方有没有可能跑路？资质够不够？可以多找几家对比，或者额外找一家做备胎。又或者找两三家一起合作，不把鸡蛋放在一个篮子里。并且要定期验收，定期检查质量。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w911" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><p>那么像这次疫情，不能归类为普通的风险，应该定性为<code>不可抗力风险</code>，因为你预测不到，而且有时候政府的一个突发性政策就会导致项目无法进行（比如我们的物流项目，和政策息息相关，所以我们很多高层每个季度都要去相关部门参加各种培训，甚至一些资质认证的考试。从而伪实时的跟着政策走）。所以应该纳入免责条款，所以合同里应该要写清，如果不写清除，会有后期的各种纠纷。就比如你公司被人炸了，被陨石击中了，这些都是外部的不可抗力，一般人还真遇不到。像N年前，有个哥们车子被陨石击中，保险公司不赔，为啥，因为这是不可抗力因素呀！<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w799" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>如果是平时的风险，一般来说PM或者PMO能去把控或者承担风险责任，但是想这次疫情对所有企业的袭击，就会上升到企业层面，由企业来承当整个公司的风险后果，所有高层都应该出来协调各方项目资源、项目整合、与项目管理。为什么要这么做，这个其实就是统一整合式管理，因为所有的项目全部受影响，就需要统一的整合了，保证一致性。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w764" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>审查风险</h3>
</div><div class="cl-preview-section"><p>分析在这次风险中的各个环节，对比原有计划所存在的出入点。比如：</p>
</div><div class="cl-preview-section"><ul><li>特殊物流运输会减少流量
<ul><li>工厂需求减少</li>
<li>大型物流车停滞所产生的消耗费（一天不开车，每辆亏损上千）</li>
</ul></li>
<li>交通管制导致原有特殊导航系统不可用，油费额外增多</li>
<li>员工需要自我14天隔离的费用</li>
<li>每日口罩成本损耗</li>
<li>远程办公可能会带来的额外成本
<ul><li>微信视频会议等都免费</li>
<li>国外的一些团队协作工具收费<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w600" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><h3>应对风险</h3>
</div><div class="cl-preview-section"><p>不管遇到任何风险，第一个要做的就是上报，注意，不要越级上报，你是PM，你上面有PMO，所要先汇报给PMO，如果没有PMO就汇报给你的直属经理，比如部门经理或者部门总监。在这个过程中，要响应政府号召，比如排查啊隔离啥的，每日体温测量，人员动向，如果有异常情况，也要及时上报。那么作为项目经理，就需要根据实际情况来适当调整原项目进度计划，适当延后，和参与的相关干系人讨论方案，与客户协调沟通。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w701" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>随后，你要看风险是否可控，是否可以规避，常规的你的下属要离职，那么你就去谈谈，能不能挽留，能不能协调公司资源给他涨薪，了解其诉求，解决其诉求。如果是一些额外成本费用，那么可能还是需要通过上报批准，当然如果小成本你要自己解决也行。像这次疫情，对于一些不可继续的项目，只能停止复工，往后延期延迟，硬着头皮偷偷上一旦被查会承担一些法律责任。比如我们有很多车队因为交通管制无法上路，每天每辆车的停车费用有很多，需要和司机和管理处协调，谈判能否降低停车成本，降低企业成本。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w679" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第三，转移风险，降低风险影响，一般来说就是弥补，最常见的就是保险业务。我们每辆车都投了巨大的保额，为啥？因为全国这么多车，一旦发生车祸，人员伤亡，你都处理不过来，这个时候就需要有保险的介入，以此把风险转移给保险公司，以最小的时间人力成本来降低风险。那么对于这次疫情，作为PM，需要回顾一下所有的实体资源，看看是否有一些保险可以弥补一定的损失。我们审查以后，对于司机的健康保险是可以有一定的弥补的，有总比没有好。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w603" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第四，主动降低风险，这个其实很简单，就是响应号召，戴口罩，少出门，勤洗手，多消毒，降低自身感染病毒的风险。</p>
</div><div class="cl-preview-section"><p>第五，接受风险，这个分为主动和被动之分：</p>
</div><div class="cl-preview-section"><ul><li>主动：实行远程办公，线上的一些项目都可以采取这种方式，互联网企业是较多的，还有一些自媒体啥的，这些完全可以在家里办公，而且可以利用远程协作工具来开展团队管理。但是也要注意，PM要每天定时跟踪每位团队成员的健康度，比如测量体温，观察身体异常。</li>
<li>被动：这个就没办法了，线下的传统企业几乎都栽进去了，我们必须响应号召，延迟复工，工厂不得开，要开也要得报备审查。如果不行只能停止运作。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w683" style="width:100%;"></li>
</ul></div><div class="cl-preview-section"><p>第六，要提交应急风险变更通知，因为项目整体肯定会受到影响，所以原计划是肯定要做出变动的，比如最大的成本开支，以及预算，都要跟着市场资源做变动，变动了才能有效调控。如果资源没有，或者成本实在太高，影响项目利润，那么就只能暂缓延迟。</p>
</div><div class="cl-preview-section"><h3>不可抗力的风险能否免责</h3>
</div><div class="cl-preview-section"><p>对于类似的不可抗力风险，造成项目滞后，成本超支，项目亏损，企业亏损，能不能获得一定的索赔呢？</p>
</div><div class="cl-preview-section"><p>对于合同规定，是有不可抗力因素的，如果因为这次疫情，是可以免除部分或者全部的责任，比如常规的，延期赔偿100万，那么这个时候100万完全可以免责。合同双方不能对彼此提出索赔等要求。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w1015" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>疫情后的市场机遇</h3>
</div><div class="cl-preview-section"><p>疫情带来巨大影响，也会带来更大的机遇，比如说把一些线下的发展为线上的：</p>
</div><div class="cl-preview-section"><ul><li>游戏
<ul><li>这没啥好说的，不管啥时候都很火，在家没事天天打游戏。</li>
</ul></li>
<li>在线医生
<ul><li>遇到问题，线上诊断，小毛病自己解决，大毛病还是去医院</li>
</ul></li>
<li>社区电商
<ul><li>很多人不出去买菜，有些社区电商崛起了，我朋友从送菜的变成了总代理，吊炸天</li>
</ul></li>
<li>短视频
<ul><li>几亿人的娱乐场所，爸爸妈妈们的茶余饭后</li>
</ul></li>
<li>在线教育
<ul><li>正所谓停课不停学，不去学校上课，老师们在直播间互动啊</li>
</ul></li>
<li>健康管家，生物科学
<ul><li>比如苹果的健康应用，可以检测你的心率啊呼吸啊啥的，如果有问题会提醒你，甚至在你遇到危机的时候自动拨号求救。</li>
</ul></li>
<li>远程办公，异地办公
<ul><li>这个不用多说了，很多人都在家办公，开会、培训，团队协作少不了。</li>
<li>异地办公，这个是长期在家，很多国外公司就是这样，甚至员工分布在各国，每年去总部一次的，也有。</li>
</ul></li>
</ul></div>\n\t\t\t\t\t\t', "/static/demo-normal.png", '后端', 'main', 45),
       (7, 1, "PHP从入门到精通", '\n\t\t\t\t\t\t<div class="cl-preview-section"><p>大家好，我是风间影月，慕课网<a href="https://class.imooc.com/sale/javaarchitect?mc_marking=c6615303b3175f848fccdb52abb833ec&mc_channel=shouji">《Java架构师成长直通车》</a>课程架构师讲师团成员之一。这篇文章我们一起来聊一聊疫情风险管理。</p>
</div><div class="cl-preview-section"><h3>引子</h3>
</div><div class="cl-preview-section"><p>相信大家都经历了疫情，在疫情之下，企业推迟复工，多地封城封路，各行各业都收到了冲击，甚至很多企业都因此倒闭，那么在企业项目管理中，有一点我们需要把控的就是风险管理，遇到风险如何更好的去调控，把损失降低。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w677" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>作为项目经理，应该如何面对，如何处理，如何协调资源，这些都是作为一名PM所需要去考虑的。</p>
</div><div class="cl-preview-section"><p>当各个企业收到延长春节并延迟复工的消息以后，很多企业的项目都停止了，无法正常运作，尤其是一些传统企业收到的打击最大，比如线下物流，工厂等，而互联网企业相对好一些，项目都是在线的，而且大家可以在家远程办公就能整合到一起。（像我们的线下物流就完全停了，对接的工厂端也完全停了，工厂停了，环境监测系统也用不着了，一连串的连带效应）<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w638" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>其实不论线上还是线下，项目进度肯定会延期，资源成本提升，这么一来很多项目都是亏本的，甚至还会因为合同而赔钱。那么这个时候项目就应该不能按照原计划进行，而需要适当进行变更，因为这是外部的不可抗力的因素。项目经理首先最要考虑的就是干系人管理，尤其是你的客户，管理客户，打好招呼，伺候好，维护好现有关系，那么项目上的后续事宜可以更好的开展。</p>
</div><div class="cl-preview-section"><h3>认清风险</h3>
</div><div class="cl-preview-section"><p>一般项目初期在规划项目编撰合同的时候，相关的风险都应该去有所考虑以及有应对的预案，举几个最简单的例子：</p>
</div><div class="cl-preview-section"><ul><li>项目开展过程中人员流动或者疾病风险
<ul><li>招储备人员（外包公司叫做on bench）</li>
<li>激励政策，也就是TeamBuilding，团队融洽度，每月一次TB，每季度一次项目分红（我们是1500/人）</li>
</ul></li>
<li>服务器/硬件设备风险
<ul><li>自建机房要有容灾预案</li>
<li>云服务器要有多地主备</li>
</ul></li>
<li>成本风险
<ul><li>项目中涉及到的采购供应，成本管理需要做好，预算多少，会否超支，有没有可能因为投入越来越多而导致项目亏损，或者盈利不多，需要提前规划和准备。</li>
</ul></li>
<li>第三方风险
<ul><li>一个项目中可能会有20%-40%甚至更多的内容会外包给第三方公司，第三方有没有可能跑路？资质够不够？可以多找几家对比，或者额外找一家做备胎。又或者找两三家一起合作，不把鸡蛋放在一个篮子里。并且要定期验收，定期检查质量。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w911" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><p>那么像这次疫情，不能归类为普通的风险，应该定性为<code>不可抗力风险</code>，因为你预测不到，而且有时候政府的一个突发性政策就会导致项目无法进行（比如我们的物流项目，和政策息息相关，所以我们很多高层每个季度都要去相关部门参加各种培训，甚至一些资质认证的考试。从而伪实时的跟着政策走）。所以应该纳入免责条款，所以合同里应该要写清，如果不写清除，会有后期的各种纠纷。就比如你公司被人炸了，被陨石击中了，这些都是外部的不可抗力，一般人还真遇不到。像N年前，有个哥们车子被陨石击中，保险公司不赔，为啥，因为这是不可抗力因素呀！<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w799" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>如果是平时的风险，一般来说PM或者PMO能去把控或者承担风险责任，但是想这次疫情对所有企业的袭击，就会上升到企业层面，由企业来承当整个公司的风险后果，所有高层都应该出来协调各方项目资源、项目整合、与项目管理。为什么要这么做，这个其实就是统一整合式管理，因为所有的项目全部受影响，就需要统一的整合了，保证一致性。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w764" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>审查风险</h3>
</div><div class="cl-preview-section"><p>分析在这次风险中的各个环节，对比原有计划所存在的出入点。比如：</p>
</div><div class="cl-preview-section"><ul><li>特殊物流运输会减少流量
<ul><li>工厂需求减少</li>
<li>大型物流车停滞所产生的消耗费（一天不开车，每辆亏损上千）</li>
</ul></li>
<li>交通管制导致原有特殊导航系统不可用，油费额外增多</li>
<li>员工需要自我14天隔离的费用</li>
<li>每日口罩成本损耗</li>
<li>远程办公可能会带来的额外成本
<ul><li>微信视频会议等都免费</li>
<li>国外的一些团队协作工具收费<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w600" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><h3>应对风险</h3>
</div><div class="cl-preview-section"><p>不管遇到任何风险，第一个要做的就是上报，注意，不要越级上报，你是PM，你上面有PMO，所要先汇报给PMO，如果没有PMO就汇报给你的直属经理，比如部门经理或者部门总监。在这个过程中，要响应政府号召，比如排查啊隔离啥的，每日体温测量，人员动向，如果有异常情况，也要及时上报。那么作为项目经理，就需要根据实际情况来适当调整原项目进度计划，适当延后，和参与的相关干系人讨论方案，与客户协调沟通。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w701" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>随后，你要看风险是否可控，是否可以规避，常规的你的下属要离职，那么你就去谈谈，能不能挽留，能不能协调公司资源给他涨薪，了解其诉求，解决其诉求。如果是一些额外成本费用，那么可能还是需要通过上报批准，当然如果小成本你要自己解决也行。像这次疫情，对于一些不可继续的项目，只能停止复工，往后延期延迟，硬着头皮偷偷上一旦被查会承担一些法律责任。比如我们有很多车队因为交通管制无法上路，每天每辆车的停车费用有很多，需要和司机和管理处协调，谈判能否降低停车成本，降低企业成本。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w679" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第三，转移风险，降低风险影响，一般来说就是弥补，最常见的就是保险业务。我们每辆车都投了巨大的保额，为啥？因为全国这么多车，一旦发生车祸，人员伤亡，你都处理不过来，这个时候就需要有保险的介入，以此把风险转移给保险公司，以最小的时间人力成本来降低风险。那么对于这次疫情，作为PM，需要回顾一下所有的实体资源，看看是否有一些保险可以弥补一定的损失。我们审查以后，对于司机的健康保险是可以有一定的弥补的，有总比没有好。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w603" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第四，主动降低风险，这个其实很简单，就是响应号召，戴口罩，少出门，勤洗手，多消毒，降低自身感染病毒的风险。</p>
</div><div class="cl-preview-section"><p>第五，接受风险，这个分为主动和被动之分：</p>
</div><div class="cl-preview-section"><ul><li>主动：实行远程办公，线上的一些项目都可以采取这种方式，互联网企业是较多的，还有一些自媒体啥的，这些完全可以在家里办公，而且可以利用远程协作工具来开展团队管理。但是也要注意，PM要每天定时跟踪每位团队成员的健康度，比如测量体温，观察身体异常。</li>
<li>被动：这个就没办法了，线下的传统企业几乎都栽进去了，我们必须响应号召，延迟复工，工厂不得开，要开也要得报备审查。如果不行只能停止运作。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w683" style="width:100%;"></li>
</ul></div><div class="cl-preview-section"><p>第六，要提交应急风险变更通知，因为项目整体肯定会受到影响，所以原计划是肯定要做出变动的，比如最大的成本开支，以及预算，都要跟着市场资源做变动，变动了才能有效调控。如果资源没有，或者成本实在太高，影响项目利润，那么就只能暂缓延迟。</p>
</div><div class="cl-preview-section"><h3>不可抗力的风险能否免责</h3>
</div><div class="cl-preview-section"><p>对于类似的不可抗力风险，造成项目滞后，成本超支，项目亏损，企业亏损，能不能获得一定的索赔呢？</p>
</div><div class="cl-preview-section"><p>对于合同规定，是有不可抗力因素的，如果因为这次疫情，是可以免除部分或者全部的责任，比如常规的，延期赔偿100万，那么这个时候100万完全可以免责。合同双方不能对彼此提出索赔等要求。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w1015" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>疫情后的市场机遇</h3>
</div><div class="cl-preview-section"><p>疫情带来巨大影响，也会带来更大的机遇，比如说把一些线下的发展为线上的：</p>
</div><div class="cl-preview-section"><ul><li>游戏
<ul><li>这没啥好说的，不管啥时候都很火，在家没事天天打游戏。</li>
</ul></li>
<li>在线医生
<ul><li>遇到问题，线上诊断，小毛病自己解决，大毛病还是去医院</li>
</ul></li>
<li>社区电商
<ul><li>很多人不出去买菜，有些社区电商崛起了，我朋友从送菜的变成了总代理，吊炸天</li>
</ul></li>
<li>短视频
<ul><li>几亿人的娱乐场所，爸爸妈妈们的茶余饭后</li>
</ul></li>
<li>在线教育
<ul><li>正所谓停课不停学，不去学校上课，老师们在直播间互动啊</li>
</ul></li>
<li>健康管家，生物科学
<ul><li>比如苹果的健康应用，可以检测你的心率啊呼吸啊啥的，如果有问题会提醒你，甚至在你遇到危机的时候自动拨号求救。</li>
</ul></li>
<li>远程办公，异地办公
<ul><li>这个不用多说了，很多人都在家办公，开会、培训，团队协作少不了。</li>
<li>异地办公，这个是长期在家，很多国外公司就是这样，甚至员工分布在各国，每年去总部一次的，也有。</li>
</ul></li>
</ul></div>\n\t\t\t\t\t\t', "/static/demo-normal.png,/static/demo-normal.png", 'PHP,后端,前端', 'basic', 45),
       (8, 1, "Ruby从入门到精通", '\n\t\t\t\t\t\t<div class="cl-preview-section"><p>大家好，我是风间影月，慕课网<a href="https://class.imooc.com/sale/javaarchitect?mc_marking=c6615303b3175f848fccdb52abb833ec&mc_channel=shouji">《Java架构师成长直通车》</a>课程架构师讲师团成员之一。这篇文章我们一起来聊一聊疫情风险管理。</p>
</div><div class="cl-preview-section"><h3>引子</h3>
</div><div class="cl-preview-section"><p>相信大家都经历了疫情，在疫情之下，企业推迟复工，多地封城封路，各行各业都收到了冲击，甚至很多企业都因此倒闭，那么在企业项目管理中，有一点我们需要把控的就是风险管理，遇到风险如何更好的去调控，把损失降低。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w677" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>作为项目经理，应该如何面对，如何处理，如何协调资源，这些都是作为一名PM所需要去考虑的。</p>
</div><div class="cl-preview-section"><p>当各个企业收到延长春节并延迟复工的消息以后，很多企业的项目都停止了，无法正常运作，尤其是一些传统企业收到的打击最大，比如线下物流，工厂等，而互联网企业相对好一些，项目都是在线的，而且大家可以在家远程办公就能整合到一起。（像我们的线下物流就完全停了，对接的工厂端也完全停了，工厂停了，环境监测系统也用不着了，一连串的连带效应）<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w638" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>其实不论线上还是线下，项目进度肯定会延期，资源成本提升，这么一来很多项目都是亏本的，甚至还会因为合同而赔钱。那么这个时候项目就应该不能按照原计划进行，而需要适当进行变更，因为这是外部的不可抗力的因素。项目经理首先最要考虑的就是干系人管理，尤其是你的客户，管理客户，打好招呼，伺候好，维护好现有关系，那么项目上的后续事宜可以更好的开展。</p>
</div><div class="cl-preview-section"><h3>认清风险</h3>
</div><div class="cl-preview-section"><p>一般项目初期在规划项目编撰合同的时候，相关的风险都应该去有所考虑以及有应对的预案，举几个最简单的例子：</p>
</div><div class="cl-preview-section"><ul><li>项目开展过程中人员流动或者疾病风险
<ul><li>招储备人员（外包公司叫做on bench）</li>
<li>激励政策，也就是TeamBuilding，团队融洽度，每月一次TB，每季度一次项目分红（我们是1500/人）</li>
</ul></li>
<li>服务器/硬件设备风险
<ul><li>自建机房要有容灾预案</li>
<li>云服务器要有多地主备</li>
</ul></li>
<li>成本风险
<ul><li>项目中涉及到的采购供应，成本管理需要做好，预算多少，会否超支，有没有可能因为投入越来越多而导致项目亏损，或者盈利不多，需要提前规划和准备。</li>
</ul></li>
<li>第三方风险
<ul><li>一个项目中可能会有20%-40%甚至更多的内容会外包给第三方公司，第三方有没有可能跑路？资质够不够？可以多找几家对比，或者额外找一家做备胎。又或者找两三家一起合作，不把鸡蛋放在一个篮子里。并且要定期验收，定期检查质量。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w911" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><p>那么像这次疫情，不能归类为普通的风险，应该定性为<code>不可抗力风险</code>，因为你预测不到，而且有时候政府的一个突发性政策就会导致项目无法进行（比如我们的物流项目，和政策息息相关，所以我们很多高层每个季度都要去相关部门参加各种培训，甚至一些资质认证的考试。从而伪实时的跟着政策走）。所以应该纳入免责条款，所以合同里应该要写清，如果不写清除，会有后期的各种纠纷。就比如你公司被人炸了，被陨石击中了，这些都是外部的不可抗力，一般人还真遇不到。像N年前，有个哥们车子被陨石击中，保险公司不赔，为啥，因为这是不可抗力因素呀！<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w799" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>如果是平时的风险，一般来说PM或者PMO能去把控或者承担风险责任，但是想这次疫情对所有企业的袭击，就会上升到企业层面，由企业来承当整个公司的风险后果，所有高层都应该出来协调各方项目资源、项目整合、与项目管理。为什么要这么做，这个其实就是统一整合式管理，因为所有的项目全部受影响，就需要统一的整合了，保证一致性。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w764" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>审查风险</h3>
</div><div class="cl-preview-section"><p>分析在这次风险中的各个环节，对比原有计划所存在的出入点。比如：</p>
</div><div class="cl-preview-section"><ul><li>特殊物流运输会减少流量
<ul><li>工厂需求减少</li>
<li>大型物流车停滞所产生的消耗费（一天不开车，每辆亏损上千）</li>
</ul></li>
<li>交通管制导致原有特殊导航系统不可用，油费额外增多</li>
<li>员工需要自我14天隔离的费用</li>
<li>每日口罩成本损耗</li>
<li>远程办公可能会带来的额外成本
<ul><li>微信视频会议等都免费</li>
<li>国外的一些团队协作工具收费<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w600" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><h3>应对风险</h3>
</div><div class="cl-preview-section"><p>不管遇到任何风险，第一个要做的就是上报，注意，不要越级上报，你是PM，你上面有PMO，所要先汇报给PMO，如果没有PMO就汇报给你的直属经理，比如部门经理或者部门总监。在这个过程中，要响应政府号召，比如排查啊隔离啥的，每日体温测量，人员动向，如果有异常情况，也要及时上报。那么作为项目经理，就需要根据实际情况来适当调整原项目进度计划，适当延后，和参与的相关干系人讨论方案，与客户协调沟通。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w701" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>随后，你要看风险是否可控，是否可以规避，常规的你的下属要离职，那么你就去谈谈，能不能挽留，能不能协调公司资源给他涨薪，了解其诉求，解决其诉求。如果是一些额外成本费用，那么可能还是需要通过上报批准，当然如果小成本你要自己解决也行。像这次疫情，对于一些不可继续的项目，只能停止复工，往后延期延迟，硬着头皮偷偷上一旦被查会承担一些法律责任。比如我们有很多车队因为交通管制无法上路，每天每辆车的停车费用有很多，需要和司机和管理处协调，谈判能否降低停车成本，降低企业成本。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w679" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第三，转移风险，降低风险影响，一般来说就是弥补，最常见的就是保险业务。我们每辆车都投了巨大的保额，为啥？因为全国这么多车，一旦发生车祸，人员伤亡，你都处理不过来，这个时候就需要有保险的介入，以此把风险转移给保险公司，以最小的时间人力成本来降低风险。那么对于这次疫情，作为PM，需要回顾一下所有的实体资源，看看是否有一些保险可以弥补一定的损失。我们审查以后，对于司机的健康保险是可以有一定的弥补的，有总比没有好。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w603" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第四，主动降低风险，这个其实很简单，就是响应号召，戴口罩，少出门，勤洗手，多消毒，降低自身感染病毒的风险。</p>
</div><div class="cl-preview-section"><p>第五，接受风险，这个分为主动和被动之分：</p>
</div><div class="cl-preview-section"><ul><li>主动：实行远程办公，线上的一些项目都可以采取这种方式，互联网企业是较多的，还有一些自媒体啥的，这些完全可以在家里办公，而且可以利用远程协作工具来开展团队管理。但是也要注意，PM要每天定时跟踪每位团队成员的健康度，比如测量体温，观察身体异常。</li>
<li>被动：这个就没办法了，线下的传统企业几乎都栽进去了，我们必须响应号召，延迟复工，工厂不得开，要开也要得报备审查。如果不行只能停止运作。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w683" style="width:100%;"></li>
</ul></div><div class="cl-preview-section"><p>第六，要提交应急风险变更通知，因为项目整体肯定会受到影响，所以原计划是肯定要做出变动的，比如最大的成本开支，以及预算，都要跟着市场资源做变动，变动了才能有效调控。如果资源没有，或者成本实在太高，影响项目利润，那么就只能暂缓延迟。</p>
</div><div class="cl-preview-section"><h3>不可抗力的风险能否免责</h3>
</div><div class="cl-preview-section"><p>对于类似的不可抗力风险，造成项目滞后，成本超支，项目亏损，企业亏损，能不能获得一定的索赔呢？</p>
</div><div class="cl-preview-section"><p>对于合同规定，是有不可抗力因素的，如果因为这次疫情，是可以免除部分或者全部的责任，比如常规的，延期赔偿100万，那么这个时候100万完全可以免责。合同双方不能对彼此提出索赔等要求。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w1015" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>疫情后的市场机遇</h3>
</div><div class="cl-preview-section"><p>疫情带来巨大影响，也会带来更大的机遇，比如说把一些线下的发展为线上的：</p>
</div><div class="cl-preview-section"><ul><li>游戏
<ul><li>这没啥好说的，不管啥时候都很火，在家没事天天打游戏。</li>
</ul></li>
<li>在线医生
<ul><li>遇到问题，线上诊断，小毛病自己解决，大毛病还是去医院</li>
</ul></li>
<li>社区电商
<ul><li>很多人不出去买菜，有些社区电商崛起了，我朋友从送菜的变成了总代理，吊炸天</li>
</ul></li>
<li>短视频
<ul><li>几亿人的娱乐场所，爸爸妈妈们的茶余饭后</li>
</ul></li>
<li>在线教育
<ul><li>正所谓停课不停学，不去学校上课，老师们在直播间互动啊</li>
</ul></li>
<li>健康管家，生物科学
<ul><li>比如苹果的健康应用，可以检测你的心率啊呼吸啊啥的，如果有问题会提醒你，甚至在你遇到危机的时候自动拨号求救。</li>
</ul></li>
<li>远程办公，异地办公
<ul><li>这个不用多说了，很多人都在家办公，开会、培训，团队协作少不了。</li>
<li>异地办公，这个是长期在家，很多国外公司就是这样，甚至员工分布在各国，每年去总部一次的，也有。</li>
</ul></li>
</ul></div>\n\t\t\t\t\t\t', "/static/demo-normal.png,/static/demo-normal.png", 'Ruby,后端', 'multi', 23),
       (9, 1, "Rust从入门到精通", '\n\t\t\t\t\t\t<div class="cl-preview-section"><p>大家好，我是风间影月，慕课网<a href="https://class.imooc.com/sale/javaarchitect?mc_marking=c6615303b3175f848fccdb52abb833ec&mc_channel=shouji">《Java架构师成长直通车》</a>课程架构师讲师团成员之一。这篇文章我们一起来聊一聊疫情风险管理。</p>
</div><div class="cl-preview-section"><h3>引子</h3>
</div><div class="cl-preview-section"><p>相信大家都经历了疫情，在疫情之下，企业推迟复工，多地封城封路，各行各业都收到了冲击，甚至很多企业都因此倒闭，那么在企业项目管理中，有一点我们需要把控的就是风险管理，遇到风险如何更好的去调控，把损失降低。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w677" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>作为项目经理，应该如何面对，如何处理，如何协调资源，这些都是作为一名PM所需要去考虑的。</p>
</div><div class="cl-preview-section"><p>当各个企业收到延长春节并延迟复工的消息以后，很多企业的项目都停止了，无法正常运作，尤其是一些传统企业收到的打击最大，比如线下物流，工厂等，而互联网企业相对好一些，项目都是在线的，而且大家可以在家远程办公就能整合到一起。（像我们的线下物流就完全停了，对接的工厂端也完全停了，工厂停了，环境监测系统也用不着了，一连串的连带效应）<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w638" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>其实不论线上还是线下，项目进度肯定会延期，资源成本提升，这么一来很多项目都是亏本的，甚至还会因为合同而赔钱。那么这个时候项目就应该不能按照原计划进行，而需要适当进行变更，因为这是外部的不可抗力的因素。项目经理首先最要考虑的就是干系人管理，尤其是你的客户，管理客户，打好招呼，伺候好，维护好现有关系，那么项目上的后续事宜可以更好的开展。</p>
</div><div class="cl-preview-section"><h3>认清风险</h3>
</div><div class="cl-preview-section"><p>一般项目初期在规划项目编撰合同的时候，相关的风险都应该去有所考虑以及有应对的预案，举几个最简单的例子：</p>
</div><div class="cl-preview-section"><ul><li>项目开展过程中人员流动或者疾病风险
<ul><li>招储备人员（外包公司叫做on bench）</li>
<li>激励政策，也就是TeamBuilding，团队融洽度，每月一次TB，每季度一次项目分红（我们是1500/人）</li>
</ul></li>
<li>服务器/硬件设备风险
<ul><li>自建机房要有容灾预案</li>
<li>云服务器要有多地主备</li>
</ul></li>
<li>成本风险
<ul><li>项目中涉及到的采购供应，成本管理需要做好，预算多少，会否超支，有没有可能因为投入越来越多而导致项目亏损，或者盈利不多，需要提前规划和准备。</li>
</ul></li>
<li>第三方风险
<ul><li>一个项目中可能会有20%-40%甚至更多的内容会外包给第三方公司，第三方有没有可能跑路？资质够不够？可以多找几家对比，或者额外找一家做备胎。又或者找两三家一起合作，不把鸡蛋放在一个篮子里。并且要定期验收，定期检查质量。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w911" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><p>那么像这次疫情，不能归类为普通的风险，应该定性为<code>不可抗力风险</code>，因为你预测不到，而且有时候政府的一个突发性政策就会导致项目无法进行（比如我们的物流项目，和政策息息相关，所以我们很多高层每个季度都要去相关部门参加各种培训，甚至一些资质认证的考试。从而伪实时的跟着政策走）。所以应该纳入免责条款，所以合同里应该要写清，如果不写清除，会有后期的各种纠纷。就比如你公司被人炸了，被陨石击中了，这些都是外部的不可抗力，一般人还真遇不到。像N年前，有个哥们车子被陨石击中，保险公司不赔，为啥，因为这是不可抗力因素呀！<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w799" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>如果是平时的风险，一般来说PM或者PMO能去把控或者承担风险责任，但是想这次疫情对所有企业的袭击，就会上升到企业层面，由企业来承当整个公司的风险后果，所有高层都应该出来协调各方项目资源、项目整合、与项目管理。为什么要这么做，这个其实就是统一整合式管理，因为所有的项目全部受影响，就需要统一的整合了，保证一致性。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w764" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>审查风险</h3>
</div><div class="cl-preview-section"><p>分析在这次风险中的各个环节，对比原有计划所存在的出入点。比如：</p>
</div><div class="cl-preview-section"><ul><li>特殊物流运输会减少流量
<ul><li>工厂需求减少</li>
<li>大型物流车停滞所产生的消耗费（一天不开车，每辆亏损上千）</li>
</ul></li>
<li>交通管制导致原有特殊导航系统不可用，油费额外增多</li>
<li>员工需要自我14天隔离的费用</li>
<li>每日口罩成本损耗</li>
<li>远程办公可能会带来的额外成本
<ul><li>微信视频会议等都免费</li>
<li>国外的一些团队协作工具收费<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w600" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><h3>应对风险</h3>
</div><div class="cl-preview-section"><p>不管遇到任何风险，第一个要做的就是上报，注意，不要越级上报，你是PM，你上面有PMO，所要先汇报给PMO，如果没有PMO就汇报给你的直属经理，比如部门经理或者部门总监。在这个过程中，要响应政府号召，比如排查啊隔离啥的，每日体温测量，人员动向，如果有异常情况，也要及时上报。那么作为项目经理，就需要根据实际情况来适当调整原项目进度计划，适当延后，和参与的相关干系人讨论方案，与客户协调沟通。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w701" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>随后，你要看风险是否可控，是否可以规避，常规的你的下属要离职，那么你就去谈谈，能不能挽留，能不能协调公司资源给他涨薪，了解其诉求，解决其诉求。如果是一些额外成本费用，那么可能还是需要通过上报批准，当然如果小成本你要自己解决也行。像这次疫情，对于一些不可继续的项目，只能停止复工，往后延期延迟，硬着头皮偷偷上一旦被查会承担一些法律责任。比如我们有很多车队因为交通管制无法上路，每天每辆车的停车费用有很多，需要和司机和管理处协调，谈判能否降低停车成本，降低企业成本。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w679" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第三，转移风险，降低风险影响，一般来说就是弥补，最常见的就是保险业务。我们每辆车都投了巨大的保额，为啥？因为全国这么多车，一旦发生车祸，人员伤亡，你都处理不过来，这个时候就需要有保险的介入，以此把风险转移给保险公司，以最小的时间人力成本来降低风险。那么对于这次疫情，作为PM，需要回顾一下所有的实体资源，看看是否有一些保险可以弥补一定的损失。我们审查以后，对于司机的健康保险是可以有一定的弥补的，有总比没有好。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w603" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第四，主动降低风险，这个其实很简单，就是响应号召，戴口罩，少出门，勤洗手，多消毒，降低自身感染病毒的风险。</p>
</div><div class="cl-preview-section"><p>第五，接受风险，这个分为主动和被动之分：</p>
</div><div class="cl-preview-section"><ul><li>主动：实行远程办公，线上的一些项目都可以采取这种方式，互联网企业是较多的，还有一些自媒体啥的，这些完全可以在家里办公，而且可以利用远程协作工具来开展团队管理。但是也要注意，PM要每天定时跟踪每位团队成员的健康度，比如测量体温，观察身体异常。</li>
<li>被动：这个就没办法了，线下的传统企业几乎都栽进去了，我们必须响应号召，延迟复工，工厂不得开，要开也要得报备审查。如果不行只能停止运作。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w683" style="width:100%;"></li>
</ul></div><div class="cl-preview-section"><p>第六，要提交应急风险变更通知，因为项目整体肯定会受到影响，所以原计划是肯定要做出变动的，比如最大的成本开支，以及预算，都要跟着市场资源做变动，变动了才能有效调控。如果资源没有，或者成本实在太高，影响项目利润，那么就只能暂缓延迟。</p>
</div><div class="cl-preview-section"><h3>不可抗力的风险能否免责</h3>
</div><div class="cl-preview-section"><p>对于类似的不可抗力风险，造成项目滞后，成本超支，项目亏损，企业亏损，能不能获得一定的索赔呢？</p>
</div><div class="cl-preview-section"><p>对于合同规定，是有不可抗力因素的，如果因为这次疫情，是可以免除部分或者全部的责任，比如常规的，延期赔偿100万，那么这个时候100万完全可以免责。合同双方不能对彼此提出索赔等要求。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w1015" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>疫情后的市场机遇</h3>
</div><div class="cl-preview-section"><p>疫情带来巨大影响，也会带来更大的机遇，比如说把一些线下的发展为线上的：</p>
</div><div class="cl-preview-section"><ul><li>游戏
<ul><li>这没啥好说的，不管啥时候都很火，在家没事天天打游戏。</li>
</ul></li>
<li>在线医生
<ul><li>遇到问题，线上诊断，小毛病自己解决，大毛病还是去医院</li>
</ul></li>
<li>社区电商
<ul><li>很多人不出去买菜，有些社区电商崛起了，我朋友从送菜的变成了总代理，吊炸天</li>
</ul></li>
<li>短视频
<ul><li>几亿人的娱乐场所，爸爸妈妈们的茶余饭后</li>
</ul></li>
<li>在线教育
<ul><li>正所谓停课不停学，不去学校上课，老师们在直播间互动啊</li>
</ul></li>
<li>健康管家，生物科学
<ul><li>比如苹果的健康应用，可以检测你的心率啊呼吸啊啥的，如果有问题会提醒你，甚至在你遇到危机的时候自动拨号求救。</li>
</ul></li>
<li>远程办公，异地办公
<ul><li>这个不用多说了，很多人都在家办公，开会、培训，团队协作少不了。</li>
<li>异地办公，这个是长期在家，很多国外公司就是这样，甚至员工分布在各国，每年去总部一次的，也有。</li>
</ul></li>
</ul></div>\n\t\t\t\t\t\t', "/static/demo-normal.png,/static/demo-normal.png", 'Rust,后端', 'basic', 1),
       (10, 1, "JavaScript从入门到精通", '\n\t\t\t\t\t\t<div class="cl-preview-section"><p>大家好，我是风间影月，慕课网<a href="https://class.imooc.com/sale/javaarchitect?mc_marking=c6615303b3175f848fccdb52abb833ec&mc_channel=shouji">《Java架构师成长直通车》</a>课程架构师讲师团成员之一。这篇文章我们一起来聊一聊疫情风险管理。</p>
</div><div class="cl-preview-section"><h3>引子</h3>
</div><div class="cl-preview-section"><p>相信大家都经历了疫情，在疫情之下，企业推迟复工，多地封城封路，各行各业都收到了冲击，甚至很多企业都因此倒闭，那么在企业项目管理中，有一点我们需要把控的就是风险管理，遇到风险如何更好的去调控，把损失降低。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w677" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>作为项目经理，应该如何面对，如何处理，如何协调资源，这些都是作为一名PM所需要去考虑的。</p>
</div><div class="cl-preview-section"><p>当各个企业收到延长春节并延迟复工的消息以后，很多企业的项目都停止了，无法正常运作，尤其是一些传统企业收到的打击最大，比如线下物流，工厂等，而互联网企业相对好一些，项目都是在线的，而且大家可以在家远程办公就能整合到一起。（像我们的线下物流就完全停了，对接的工厂端也完全停了，工厂停了，环境监测系统也用不着了，一连串的连带效应）<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w638" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>其实不论线上还是线下，项目进度肯定会延期，资源成本提升，这么一来很多项目都是亏本的，甚至还会因为合同而赔钱。那么这个时候项目就应该不能按照原计划进行，而需要适当进行变更，因为这是外部的不可抗力的因素。项目经理首先最要考虑的就是干系人管理，尤其是你的客户，管理客户，打好招呼，伺候好，维护好现有关系，那么项目上的后续事宜可以更好的开展。</p>
</div><div class="cl-preview-section"><h3>认清风险</h3>
</div><div class="cl-preview-section"><p>一般项目初期在规划项目编撰合同的时候，相关的风险都应该去有所考虑以及有应对的预案，举几个最简单的例子：</p>
</div><div class="cl-preview-section"><ul><li>项目开展过程中人员流动或者疾病风险
<ul><li>招储备人员（外包公司叫做on bench）</li>
<li>激励政策，也就是TeamBuilding，团队融洽度，每月一次TB，每季度一次项目分红（我们是1500/人）</li>
</ul></li>
<li>服务器/硬件设备风险
<ul><li>自建机房要有容灾预案</li>
<li>云服务器要有多地主备</li>
</ul></li>
<li>成本风险
<ul><li>项目中涉及到的采购供应，成本管理需要做好，预算多少，会否超支，有没有可能因为投入越来越多而导致项目亏损，或者盈利不多，需要提前规划和准备。</li>
</ul></li>
<li>第三方风险
<ul><li>一个项目中可能会有20%-40%甚至更多的内容会外包给第三方公司，第三方有没有可能跑路？资质够不够？可以多找几家对比，或者额外找一家做备胎。又或者找两三家一起合作，不把鸡蛋放在一个篮子里。并且要定期验收，定期检查质量。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w911" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><p>那么像这次疫情，不能归类为普通的风险，应该定性为<code>不可抗力风险</code>，因为你预测不到，而且有时候政府的一个突发性政策就会导致项目无法进行（比如我们的物流项目，和政策息息相关，所以我们很多高层每个季度都要去相关部门参加各种培训，甚至一些资质认证的考试。从而伪实时的跟着政策走）。所以应该纳入免责条款，所以合同里应该要写清，如果不写清除，会有后期的各种纠纷。就比如你公司被人炸了，被陨石击中了，这些都是外部的不可抗力，一般人还真遇不到。像N年前，有个哥们车子被陨石击中，保险公司不赔，为啥，因为这是不可抗力因素呀！<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w799" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>如果是平时的风险，一般来说PM或者PMO能去把控或者承担风险责任，但是想这次疫情对所有企业的袭击，就会上升到企业层面，由企业来承当整个公司的风险后果，所有高层都应该出来协调各方项目资源、项目整合、与项目管理。为什么要这么做，这个其实就是统一整合式管理，因为所有的项目全部受影响，就需要统一的整合了，保证一致性。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w764" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>审查风险</h3>
</div><div class="cl-preview-section"><p>分析在这次风险中的各个环节，对比原有计划所存在的出入点。比如：</p>
</div><div class="cl-preview-section"><ul><li>特殊物流运输会减少流量
<ul><li>工厂需求减少</li>
<li>大型物流车停滞所产生的消耗费（一天不开车，每辆亏损上千）</li>
</ul></li>
<li>交通管制导致原有特殊导航系统不可用，油费额外增多</li>
<li>员工需要自我14天隔离的费用</li>
<li>每日口罩成本损耗</li>
<li>远程办公可能会带来的额外成本
<ul><li>微信视频会议等都免费</li>
<li>国外的一些团队协作工具收费<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w600" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><h3>应对风险</h3>
</div><div class="cl-preview-section"><p>不管遇到任何风险，第一个要做的就是上报，注意，不要越级上报，你是PM，你上面有PMO，所要先汇报给PMO，如果没有PMO就汇报给你的直属经理，比如部门经理或者部门总监。在这个过程中，要响应政府号召，比如排查啊隔离啥的，每日体温测量，人员动向，如果有异常情况，也要及时上报。那么作为项目经理，就需要根据实际情况来适当调整原项目进度计划，适当延后，和参与的相关干系人讨论方案，与客户协调沟通。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w701" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>随后，你要看风险是否可控，是否可以规避，常规的你的下属要离职，那么你就去谈谈，能不能挽留，能不能协调公司资源给他涨薪，了解其诉求，解决其诉求。如果是一些额外成本费用，那么可能还是需要通过上报批准，当然如果小成本你要自己解决也行。像这次疫情，对于一些不可继续的项目，只能停止复工，往后延期延迟，硬着头皮偷偷上一旦被查会承担一些法律责任。比如我们有很多车队因为交通管制无法上路，每天每辆车的停车费用有很多，需要和司机和管理处协调，谈判能否降低停车成本，降低企业成本。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w679" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第三，转移风险，降低风险影响，一般来说就是弥补，最常见的就是保险业务。我们每辆车都投了巨大的保额，为啥？因为全国这么多车，一旦发生车祸，人员伤亡，你都处理不过来，这个时候就需要有保险的介入，以此把风险转移给保险公司，以最小的时间人力成本来降低风险。那么对于这次疫情，作为PM，需要回顾一下所有的实体资源，看看是否有一些保险可以弥补一定的损失。我们审查以后，对于司机的健康保险是可以有一定的弥补的，有总比没有好。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w603" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第四，主动降低风险，这个其实很简单，就是响应号召，戴口罩，少出门，勤洗手，多消毒，降低自身感染病毒的风险。</p>
</div><div class="cl-preview-section"><p>第五，接受风险，这个分为主动和被动之分：</p>
</div><div class="cl-preview-section"><ul><li>主动：实行远程办公，线上的一些项目都可以采取这种方式，互联网企业是较多的，还有一些自媒体啥的，这些完全可以在家里办公，而且可以利用远程协作工具来开展团队管理。但是也要注意，PM要每天定时跟踪每位团队成员的健康度，比如测量体温，观察身体异常。</li>
<li>被动：这个就没办法了，线下的传统企业几乎都栽进去了，我们必须响应号召，延迟复工，工厂不得开，要开也要得报备审查。如果不行只能停止运作。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w683" style="width:100%;"></li>
</ul></div><div class="cl-preview-section"><p>第六，要提交应急风险变更通知，因为项目整体肯定会受到影响，所以原计划是肯定要做出变动的，比如最大的成本开支，以及预算，都要跟着市场资源做变动，变动了才能有效调控。如果资源没有，或者成本实在太高，影响项目利润，那么就只能暂缓延迟。</p>
</div><div class="cl-preview-section"><h3>不可抗力的风险能否免责</h3>
</div><div class="cl-preview-section"><p>对于类似的不可抗力风险，造成项目滞后，成本超支，项目亏损，企业亏损，能不能获得一定的索赔呢？</p>
</div><div class="cl-preview-section"><p>对于合同规定，是有不可抗力因素的，如果因为这次疫情，是可以免除部分或者全部的责任，比如常规的，延期赔偿100万，那么这个时候100万完全可以免责。合同双方不能对彼此提出索赔等要求。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w1015" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>疫情后的市场机遇</h3>
</div><div class="cl-preview-section"><p>疫情带来巨大影响，也会带来更大的机遇，比如说把一些线下的发展为线上的：</p>
</div><div class="cl-preview-section"><ul><li>游戏
<ul><li>这没啥好说的，不管啥时候都很火，在家没事天天打游戏。</li>
</ul></li>
<li>在线医生
<ul><li>遇到问题，线上诊断，小毛病自己解决，大毛病还是去医院</li>
</ul></li>
<li>社区电商
<ul><li>很多人不出去买菜，有些社区电商崛起了，我朋友从送菜的变成了总代理，吊炸天</li>
</ul></li>
<li>短视频
<ul><li>几亿人的娱乐场所，爸爸妈妈们的茶余饭后</li>
</ul></li>
<li>在线教育
<ul><li>正所谓停课不停学，不去学校上课，老师们在直播间互动啊</li>
</ul></li>
<li>健康管家，生物科学
<ul><li>比如苹果的健康应用，可以检测你的心率啊呼吸啊啥的，如果有问题会提醒你，甚至在你遇到危机的时候自动拨号求救。</li>
</ul></li>
<li>远程办公，异地办公
<ul><li>这个不用多说了，很多人都在家办公，开会、培训，团队协作少不了。</li>
<li>异地办公，这个是长期在家，很多国外公司就是这样，甚至员工分布在各国，每年去总部一次的，也有。</li>
</ul></li>
</ul></div>\n\t\t\t\t\t\t', "/static/demo-normal.png", '前端,后端', 'main', 23),
       (11, 1, "HTML从入门到精通", '\n\t\t\t\t\t\t<div class="cl-preview-section"><p>大家好，我是风间影月，慕课网<a href="https://class.imooc.com/sale/javaarchitect?mc_marking=c6615303b3175f848fccdb52abb833ec&mc_channel=shouji">《Java架构师成长直通车》</a>课程架构师讲师团成员之一。这篇文章我们一起来聊一聊疫情风险管理。</p>
</div><div class="cl-preview-section"><h3>引子</h3>
</div><div class="cl-preview-section"><p>相信大家都经历了疫情，在疫情之下，企业推迟复工，多地封城封路，各行各业都收到了冲击，甚至很多企业都因此倒闭，那么在企业项目管理中，有一点我们需要把控的就是风险管理，遇到风险如何更好的去调控，把损失降低。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w677" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>作为项目经理，应该如何面对，如何处理，如何协调资源，这些都是作为一名PM所需要去考虑的。</p>
</div><div class="cl-preview-section"><p>当各个企业收到延长春节并延迟复工的消息以后，很多企业的项目都停止了，无法正常运作，尤其是一些传统企业收到的打击最大，比如线下物流，工厂等，而互联网企业相对好一些，项目都是在线的，而且大家可以在家远程办公就能整合到一起。（像我们的线下物流就完全停了，对接的工厂端也完全停了，工厂停了，环境监测系统也用不着了，一连串的连带效应）<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w638" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>其实不论线上还是线下，项目进度肯定会延期，资源成本提升，这么一来很多项目都是亏本的，甚至还会因为合同而赔钱。那么这个时候项目就应该不能按照原计划进行，而需要适当进行变更，因为这是外部的不可抗力的因素。项目经理首先最要考虑的就是干系人管理，尤其是你的客户，管理客户，打好招呼，伺候好，维护好现有关系，那么项目上的后续事宜可以更好的开展。</p>
</div><div class="cl-preview-section"><h3>认清风险</h3>
</div><div class="cl-preview-section"><p>一般项目初期在规划项目编撰合同的时候，相关的风险都应该去有所考虑以及有应对的预案，举几个最简单的例子：</p>
</div><div class="cl-preview-section"><ul><li>项目开展过程中人员流动或者疾病风险
<ul><li>招储备人员（外包公司叫做on bench）</li>
<li>激励政策，也就是TeamBuilding，团队融洽度，每月一次TB，每季度一次项目分红（我们是1500/人）</li>
</ul></li>
<li>服务器/硬件设备风险
<ul><li>自建机房要有容灾预案</li>
<li>云服务器要有多地主备</li>
</ul></li>
<li>成本风险
<ul><li>项目中涉及到的采购供应，成本管理需要做好，预算多少，会否超支，有没有可能因为投入越来越多而导致项目亏损，或者盈利不多，需要提前规划和准备。</li>
</ul></li>
<li>第三方风险
<ul><li>一个项目中可能会有20%-40%甚至更多的内容会外包给第三方公司，第三方有没有可能跑路？资质够不够？可以多找几家对比，或者额外找一家做备胎。又或者找两三家一起合作，不把鸡蛋放在一个篮子里。并且要定期验收，定期检查质量。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w911" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><p>那么像这次疫情，不能归类为普通的风险，应该定性为<code>不可抗力风险</code>，因为你预测不到，而且有时候政府的一个突发性政策就会导致项目无法进行（比如我们的物流项目，和政策息息相关，所以我们很多高层每个季度都要去相关部门参加各种培训，甚至一些资质认证的考试。从而伪实时的跟着政策走）。所以应该纳入免责条款，所以合同里应该要写清，如果不写清除，会有后期的各种纠纷。就比如你公司被人炸了，被陨石击中了，这些都是外部的不可抗力，一般人还真遇不到。像N年前，有个哥们车子被陨石击中，保险公司不赔，为啥，因为这是不可抗力因素呀！<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w799" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>如果是平时的风险，一般来说PM或者PMO能去把控或者承担风险责任，但是想这次疫情对所有企业的袭击，就会上升到企业层面，由企业来承当整个公司的风险后果，所有高层都应该出来协调各方项目资源、项目整合、与项目管理。为什么要这么做，这个其实就是统一整合式管理，因为所有的项目全部受影响，就需要统一的整合了，保证一致性。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w764" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>审查风险</h3>
</div><div class="cl-preview-section"><p>分析在这次风险中的各个环节，对比原有计划所存在的出入点。比如：</p>
</div><div class="cl-preview-section"><ul><li>特殊物流运输会减少流量
<ul><li>工厂需求减少</li>
<li>大型物流车停滞所产生的消耗费（一天不开车，每辆亏损上千）</li>
</ul></li>
<li>交通管制导致原有特殊导航系统不可用，油费额外增多</li>
<li>员工需要自我14天隔离的费用</li>
<li>每日口罩成本损耗</li>
<li>远程办公可能会带来的额外成本
<ul><li>微信视频会议等都免费</li>
<li>国外的一些团队协作工具收费<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w600" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><h3>应对风险</h3>
</div><div class="cl-preview-section"><p>不管遇到任何风险，第一个要做的就是上报，注意，不要越级上报，你是PM，你上面有PMO，所要先汇报给PMO，如果没有PMO就汇报给你的直属经理，比如部门经理或者部门总监。在这个过程中，要响应政府号召，比如排查啊隔离啥的，每日体温测量，人员动向，如果有异常情况，也要及时上报。那么作为项目经理，就需要根据实际情况来适当调整原项目进度计划，适当延后，和参与的相关干系人讨论方案，与客户协调沟通。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w701" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>随后，你要看风险是否可控，是否可以规避，常规的你的下属要离职，那么你就去谈谈，能不能挽留，能不能协调公司资源给他涨薪，了解其诉求，解决其诉求。如果是一些额外成本费用，那么可能还是需要通过上报批准，当然如果小成本你要自己解决也行。像这次疫情，对于一些不可继续的项目，只能停止复工，往后延期延迟，硬着头皮偷偷上一旦被查会承担一些法律责任。比如我们有很多车队因为交通管制无法上路，每天每辆车的停车费用有很多，需要和司机和管理处协调，谈判能否降低停车成本，降低企业成本。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w679" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第三，转移风险，降低风险影响，一般来说就是弥补，最常见的就是保险业务。我们每辆车都投了巨大的保额，为啥？因为全国这么多车，一旦发生车祸，人员伤亡，你都处理不过来，这个时候就需要有保险的介入，以此把风险转移给保险公司，以最小的时间人力成本来降低风险。那么对于这次疫情，作为PM，需要回顾一下所有的实体资源，看看是否有一些保险可以弥补一定的损失。我们审查以后，对于司机的健康保险是可以有一定的弥补的，有总比没有好。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w603" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第四，主动降低风险，这个其实很简单，就是响应号召，戴口罩，少出门，勤洗手，多消毒，降低自身感染病毒的风险。</p>
</div><div class="cl-preview-section"><p>第五，接受风险，这个分为主动和被动之分：</p>
</div><div class="cl-preview-section"><ul><li>主动：实行远程办公，线上的一些项目都可以采取这种方式，互联网企业是较多的，还有一些自媒体啥的，这些完全可以在家里办公，而且可以利用远程协作工具来开展团队管理。但是也要注意，PM要每天定时跟踪每位团队成员的健康度，比如测量体温，观察身体异常。</li>
<li>被动：这个就没办法了，线下的传统企业几乎都栽进去了，我们必须响应号召，延迟复工，工厂不得开，要开也要得报备审查。如果不行只能停止运作。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w683" style="width:100%;"></li>
</ul></div><div class="cl-preview-section"><p>第六，要提交应急风险变更通知，因为项目整体肯定会受到影响，所以原计划是肯定要做出变动的，比如最大的成本开支，以及预算，都要跟着市场资源做变动，变动了才能有效调控。如果资源没有，或者成本实在太高，影响项目利润，那么就只能暂缓延迟。</p>
</div><div class="cl-preview-section"><h3>不可抗力的风险能否免责</h3>
</div><div class="cl-preview-section"><p>对于类似的不可抗力风险，造成项目滞后，成本超支，项目亏损，企业亏损，能不能获得一定的索赔呢？</p>
</div><div class="cl-preview-section"><p>对于合同规定，是有不可抗力因素的，如果因为这次疫情，是可以免除部分或者全部的责任，比如常规的，延期赔偿100万，那么这个时候100万完全可以免责。合同双方不能对彼此提出索赔等要求。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w1015" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>疫情后的市场机遇</h3>
</div><div class="cl-preview-section"><p>疫情带来巨大影响，也会带来更大的机遇，比如说把一些线下的发展为线上的：</p>
</div><div class="cl-preview-section"><ul><li>游戏
<ul><li>这没啥好说的，不管啥时候都很火，在家没事天天打游戏。</li>
</ul></li>
<li>在线医生
<ul><li>遇到问题，线上诊断，小毛病自己解决，大毛病还是去医院</li>
</ul></li>
<li>社区电商
<ul><li>很多人不出去买菜，有些社区电商崛起了，我朋友从送菜的变成了总代理，吊炸天</li>
</ul></li>
<li>短视频
<ul><li>几亿人的娱乐场所，爸爸妈妈们的茶余饭后</li>
</ul></li>
<li>在线教育
<ul><li>正所谓停课不停学，不去学校上课，老师们在直播间互动啊</li>
</ul></li>
<li>健康管家，生物科学
<ul><li>比如苹果的健康应用，可以检测你的心率啊呼吸啊啥的，如果有问题会提醒你，甚至在你遇到危机的时候自动拨号求救。</li>
</ul></li>
<li>远程办公，异地办公
<ul><li>这个不用多说了，很多人都在家办公，开会、培训，团队协作少不了。</li>
<li>异地办公，这个是长期在家，很多国外公司就是这样，甚至员工分布在各国，每年去总部一次的，也有。</li>
</ul></li>
</ul></div>\n\t\t\t\t\t\t', "/static/demo-normal.png,/static/demo-normal.png", '前端,HTML', 'basic', 55),
       (12, 1, "CSS从入门到精通", '\n\t\t\t\t\t\t<div class="cl-preview-section"><p>大家好，我是风间影月，慕课网<a href="https://class.imooc.com/sale/javaarchitect?mc_marking=c6615303b3175f848fccdb52abb833ec&mc_channel=shouji">《Java架构师成长直通车》</a>课程架构师讲师团成员之一。这篇文章我们一起来聊一聊疫情风险管理。</p>
</div><div class="cl-preview-section"><h3>引子</h3>
</div><div class="cl-preview-section"><p>相信大家都经历了疫情，在疫情之下，企业推迟复工，多地封城封路，各行各业都收到了冲击，甚至很多企业都因此倒闭，那么在企业项目管理中，有一点我们需要把控的就是风险管理，遇到风险如何更好的去调控，把损失降低。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w677" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>作为项目经理，应该如何面对，如何处理，如何协调资源，这些都是作为一名PM所需要去考虑的。</p>
</div><div class="cl-preview-section"><p>当各个企业收到延长春节并延迟复工的消息以后，很多企业的项目都停止了，无法正常运作，尤其是一些传统企业收到的打击最大，比如线下物流，工厂等，而互联网企业相对好一些，项目都是在线的，而且大家可以在家远程办公就能整合到一起。（像我们的线下物流就完全停了，对接的工厂端也完全停了，工厂停了，环境监测系统也用不着了，一连串的连带效应）<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w638" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>其实不论线上还是线下，项目进度肯定会延期，资源成本提升，这么一来很多项目都是亏本的，甚至还会因为合同而赔钱。那么这个时候项目就应该不能按照原计划进行，而需要适当进行变更，因为这是外部的不可抗力的因素。项目经理首先最要考虑的就是干系人管理，尤其是你的客户，管理客户，打好招呼，伺候好，维护好现有关系，那么项目上的后续事宜可以更好的开展。</p>
</div><div class="cl-preview-section"><h3>认清风险</h3>
</div><div class="cl-preview-section"><p>一般项目初期在规划项目编撰合同的时候，相关的风险都应该去有所考虑以及有应对的预案，举几个最简单的例子：</p>
</div><div class="cl-preview-section"><ul><li>项目开展过程中人员流动或者疾病风险
<ul><li>招储备人员（外包公司叫做on bench）</li>
<li>激励政策，也就是TeamBuilding，团队融洽度，每月一次TB，每季度一次项目分红（我们是1500/人）</li>
</ul></li>
<li>服务器/硬件设备风险
<ul><li>自建机房要有容灾预案</li>
<li>云服务器要有多地主备</li>
</ul></li>
<li>成本风险
<ul><li>项目中涉及到的采购供应，成本管理需要做好，预算多少，会否超支，有没有可能因为投入越来越多而导致项目亏损，或者盈利不多，需要提前规划和准备。</li>
</ul></li>
<li>第三方风险
<ul><li>一个项目中可能会有20%-40%甚至更多的内容会外包给第三方公司，第三方有没有可能跑路？资质够不够？可以多找几家对比，或者额外找一家做备胎。又或者找两三家一起合作，不把鸡蛋放在一个篮子里。并且要定期验收，定期检查质量。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w911" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><p>那么像这次疫情，不能归类为普通的风险，应该定性为<code>不可抗力风险</code>，因为你预测不到，而且有时候政府的一个突发性政策就会导致项目无法进行（比如我们的物流项目，和政策息息相关，所以我们很多高层每个季度都要去相关部门参加各种培训，甚至一些资质认证的考试。从而伪实时的跟着政策走）。所以应该纳入免责条款，所以合同里应该要写清，如果不写清除，会有后期的各种纠纷。就比如你公司被人炸了，被陨石击中了，这些都是外部的不可抗力，一般人还真遇不到。像N年前，有个哥们车子被陨石击中，保险公司不赔，为啥，因为这是不可抗力因素呀！<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w799" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>如果是平时的风险，一般来说PM或者PMO能去把控或者承担风险责任，但是想这次疫情对所有企业的袭击，就会上升到企业层面，由企业来承当整个公司的风险后果，所有高层都应该出来协调各方项目资源、项目整合、与项目管理。为什么要这么做，这个其实就是统一整合式管理，因为所有的项目全部受影响，就需要统一的整合了，保证一致性。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w764" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>审查风险</h3>
</div><div class="cl-preview-section"><p>分析在这次风险中的各个环节，对比原有计划所存在的出入点。比如：</p>
</div><div class="cl-preview-section"><ul><li>特殊物流运输会减少流量
<ul><li>工厂需求减少</li>
<li>大型物流车停滞所产生的消耗费（一天不开车，每辆亏损上千）</li>
</ul></li>
<li>交通管制导致原有特殊导航系统不可用，油费额外增多</li>
<li>员工需要自我14天隔离的费用</li>
<li>每日口罩成本损耗</li>
<li>远程办公可能会带来的额外成本
<ul><li>微信视频会议等都免费</li>
<li>国外的一些团队协作工具收费<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w600" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><h3>应对风险</h3>
</div><div class="cl-preview-section"><p>不管遇到任何风险，第一个要做的就是上报，注意，不要越级上报，你是PM，你上面有PMO，所要先汇报给PMO，如果没有PMO就汇报给你的直属经理，比如部门经理或者部门总监。在这个过程中，要响应政府号召，比如排查啊隔离啥的，每日体温测量，人员动向，如果有异常情况，也要及时上报。那么作为项目经理，就需要根据实际情况来适当调整原项目进度计划，适当延后，和参与的相关干系人讨论方案，与客户协调沟通。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w701" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>随后，你要看风险是否可控，是否可以规避，常规的你的下属要离职，那么你就去谈谈，能不能挽留，能不能协调公司资源给他涨薪，了解其诉求，解决其诉求。如果是一些额外成本费用，那么可能还是需要通过上报批准，当然如果小成本你要自己解决也行。像这次疫情，对于一些不可继续的项目，只能停止复工，往后延期延迟，硬着头皮偷偷上一旦被查会承担一些法律责任。比如我们有很多车队因为交通管制无法上路，每天每辆车的停车费用有很多，需要和司机和管理处协调，谈判能否降低停车成本，降低企业成本。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w679" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第三，转移风险，降低风险影响，一般来说就是弥补，最常见的就是保险业务。我们每辆车都投了巨大的保额，为啥？因为全国这么多车，一旦发生车祸，人员伤亡，你都处理不过来，这个时候就需要有保险的介入，以此把风险转移给保险公司，以最小的时间人力成本来降低风险。那么对于这次疫情，作为PM，需要回顾一下所有的实体资源，看看是否有一些保险可以弥补一定的损失。我们审查以后，对于司机的健康保险是可以有一定的弥补的，有总比没有好。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w603" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第四，主动降低风险，这个其实很简单，就是响应号召，戴口罩，少出门，勤洗手，多消毒，降低自身感染病毒的风险。</p>
</div><div class="cl-preview-section"><p>第五，接受风险，这个分为主动和被动之分：</p>
</div><div class="cl-preview-section"><ul><li>主动：实行远程办公，线上的一些项目都可以采取这种方式，互联网企业是较多的，还有一些自媒体啥的，这些完全可以在家里办公，而且可以利用远程协作工具来开展团队管理。但是也要注意，PM要每天定时跟踪每位团队成员的健康度，比如测量体温，观察身体异常。</li>
<li>被动：这个就没办法了，线下的传统企业几乎都栽进去了，我们必须响应号召，延迟复工，工厂不得开，要开也要得报备审查。如果不行只能停止运作。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w683" style="width:100%;"></li>
</ul></div><div class="cl-preview-section"><p>第六，要提交应急风险变更通知，因为项目整体肯定会受到影响，所以原计划是肯定要做出变动的，比如最大的成本开支，以及预算，都要跟着市场资源做变动，变动了才能有效调控。如果资源没有，或者成本实在太高，影响项目利润，那么就只能暂缓延迟。</p>
</div><div class="cl-preview-section"><h3>不可抗力的风险能否免责</h3>
</div><div class="cl-preview-section"><p>对于类似的不可抗力风险，造成项目滞后，成本超支，项目亏损，企业亏损，能不能获得一定的索赔呢？</p>
</div><div class="cl-preview-section"><p>对于合同规定，是有不可抗力因素的，如果因为这次疫情，是可以免除部分或者全部的责任，比如常规的，延期赔偿100万，那么这个时候100万完全可以免责。合同双方不能对彼此提出索赔等要求。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w1015" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>疫情后的市场机遇</h3>
</div><div class="cl-preview-section"><p>疫情带来巨大影响，也会带来更大的机遇，比如说把一些线下的发展为线上的：</p>
</div><div class="cl-preview-section"><ul><li>游戏
<ul><li>这没啥好说的，不管啥时候都很火，在家没事天天打游戏。</li>
</ul></li>
<li>在线医生
<ul><li>遇到问题，线上诊断，小毛病自己解决，大毛病还是去医院</li>
</ul></li>
<li>社区电商
<ul><li>很多人不出去买菜，有些社区电商崛起了，我朋友从送菜的变成了总代理，吊炸天</li>
</ul></li>
<li>短视频
<ul><li>几亿人的娱乐场所，爸爸妈妈们的茶余饭后</li>
</ul></li>
<li>在线教育
<ul><li>正所谓停课不停学，不去学校上课，老师们在直播间互动啊</li>
</ul></li>
<li>健康管家，生物科学
<ul><li>比如苹果的健康应用，可以检测你的心率啊呼吸啊啥的，如果有问题会提醒你，甚至在你遇到危机的时候自动拨号求救。</li>
</ul></li>
<li>远程办公，异地办公
<ul><li>这个不用多说了，很多人都在家办公，开会、培训，团队协作少不了。</li>
<li>异地办公，这个是长期在家，很多国外公司就是这样，甚至员工分布在各国，每年去总部一次的，也有。</li>
</ul></li>
</ul></div>\n\t\t\t\t\t\t', "/static/demo-normal.png,/static/demo-normal.png,/static/demo-normal.png",
        '前端', 'multi', 88),
       (13, 1, "Vue从入门到精通", '\n\t\t\t\t\t\t<div class="cl-preview-section"><p>大家好，我是风间影月，慕课网<a href="https://class.imooc.com/sale/javaarchitect?mc_marking=c6615303b3175f848fccdb52abb833ec&mc_channel=shouji">《Java架构师成长直通车》</a>课程架构师讲师团成员之一。这篇文章我们一起来聊一聊疫情风险管理。</p>
</div><div class="cl-preview-section"><h3>引子</h3>
</div><div class="cl-preview-section"><p>相信大家都经历了疫情，在疫情之下，企业推迟复工，多地封城封路，各行各业都收到了冲击，甚至很多企业都因此倒闭，那么在企业项目管理中，有一点我们需要把控的就是风险管理，遇到风险如何更好的去调控，把损失降低。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w677" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>作为项目经理，应该如何面对，如何处理，如何协调资源，这些都是作为一名PM所需要去考虑的。</p>
</div><div class="cl-preview-section"><p>当各个企业收到延长春节并延迟复工的消息以后，很多企业的项目都停止了，无法正常运作，尤其是一些传统企业收到的打击最大，比如线下物流，工厂等，而互联网企业相对好一些，项目都是在线的，而且大家可以在家远程办公就能整合到一起。（像我们的线下物流就完全停了，对接的工厂端也完全停了，工厂停了，环境监测系统也用不着了，一连串的连带效应）<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w638" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>其实不论线上还是线下，项目进度肯定会延期，资源成本提升，这么一来很多项目都是亏本的，甚至还会因为合同而赔钱。那么这个时候项目就应该不能按照原计划进行，而需要适当进行变更，因为这是外部的不可抗力的因素。项目经理首先最要考虑的就是干系人管理，尤其是你的客户，管理客户，打好招呼，伺候好，维护好现有关系，那么项目上的后续事宜可以更好的开展。</p>
</div><div class="cl-preview-section"><h3>认清风险</h3>
</div><div class="cl-preview-section"><p>一般项目初期在规划项目编撰合同的时候，相关的风险都应该去有所考虑以及有应对的预案，举几个最简单的例子：</p>
</div><div class="cl-preview-section"><ul><li>项目开展过程中人员流动或者疾病风险
<ul><li>招储备人员（外包公司叫做on bench）</li>
<li>激励政策，也就是TeamBuilding，团队融洽度，每月一次TB，每季度一次项目分红（我们是1500/人）</li>
</ul></li>
<li>服务器/硬件设备风险
<ul><li>自建机房要有容灾预案</li>
<li>云服务器要有多地主备</li>
</ul></li>
<li>成本风险
<ul><li>项目中涉及到的采购供应，成本管理需要做好，预算多少，会否超支，有没有可能因为投入越来越多而导致项目亏损，或者盈利不多，需要提前规划和准备。</li>
</ul></li>
<li>第三方风险
<ul><li>一个项目中可能会有20%-40%甚至更多的内容会外包给第三方公司，第三方有没有可能跑路？资质够不够？可以多找几家对比，或者额外找一家做备胎。又或者找两三家一起合作，不把鸡蛋放在一个篮子里。并且要定期验收，定期检查质量。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w911" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><p>那么像这次疫情，不能归类为普通的风险，应该定性为<code>不可抗力风险</code>，因为你预测不到，而且有时候政府的一个突发性政策就会导致项目无法进行（比如我们的物流项目，和政策息息相关，所以我们很多高层每个季度都要去相关部门参加各种培训，甚至一些资质认证的考试。从而伪实时的跟着政策走）。所以应该纳入免责条款，所以合同里应该要写清，如果不写清除，会有后期的各种纠纷。就比如你公司被人炸了，被陨石击中了，这些都是外部的不可抗力，一般人还真遇不到。像N年前，有个哥们车子被陨石击中，保险公司不赔，为啥，因为这是不可抗力因素呀！<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w799" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>如果是平时的风险，一般来说PM或者PMO能去把控或者承担风险责任，但是想这次疫情对所有企业的袭击，就会上升到企业层面，由企业来承当整个公司的风险后果，所有高层都应该出来协调各方项目资源、项目整合、与项目管理。为什么要这么做，这个其实就是统一整合式管理，因为所有的项目全部受影响，就需要统一的整合了，保证一致性。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w764" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>审查风险</h3>
</div><div class="cl-preview-section"><p>分析在这次风险中的各个环节，对比原有计划所存在的出入点。比如：</p>
</div><div class="cl-preview-section"><ul><li>特殊物流运输会减少流量
<ul><li>工厂需求减少</li>
<li>大型物流车停滞所产生的消耗费（一天不开车，每辆亏损上千）</li>
</ul></li>
<li>交通管制导致原有特殊导航系统不可用，油费额外增多</li>
<li>员工需要自我14天隔离的费用</li>
<li>每日口罩成本损耗</li>
<li>远程办公可能会带来的额外成本
<ul><li>微信视频会议等都免费</li>
<li>国外的一些团队协作工具收费<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w600" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><h3>应对风险</h3>
</div><div class="cl-preview-section"><p>不管遇到任何风险，第一个要做的就是上报，注意，不要越级上报，你是PM，你上面有PMO，所要先汇报给PMO，如果没有PMO就汇报给你的直属经理，比如部门经理或者部门总监。在这个过程中，要响应政府号召，比如排查啊隔离啥的，每日体温测量，人员动向，如果有异常情况，也要及时上报。那么作为项目经理，就需要根据实际情况来适当调整原项目进度计划，适当延后，和参与的相关干系人讨论方案，与客户协调沟通。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w701" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>随后，你要看风险是否可控，是否可以规避，常规的你的下属要离职，那么你就去谈谈，能不能挽留，能不能协调公司资源给他涨薪，了解其诉求，解决其诉求。如果是一些额外成本费用，那么可能还是需要通过上报批准，当然如果小成本你要自己解决也行。像这次疫情，对于一些不可继续的项目，只能停止复工，往后延期延迟，硬着头皮偷偷上一旦被查会承担一些法律责任。比如我们有很多车队因为交通管制无法上路，每天每辆车的停车费用有很多，需要和司机和管理处协调，谈判能否降低停车成本，降低企业成本。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w679" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第三，转移风险，降低风险影响，一般来说就是弥补，最常见的就是保险业务。我们每辆车都投了巨大的保额，为啥？因为全国这么多车，一旦发生车祸，人员伤亡，你都处理不过来，这个时候就需要有保险的介入，以此把风险转移给保险公司，以最小的时间人力成本来降低风险。那么对于这次疫情，作为PM，需要回顾一下所有的实体资源，看看是否有一些保险可以弥补一定的损失。我们审查以后，对于司机的健康保险是可以有一定的弥补的，有总比没有好。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w603" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第四，主动降低风险，这个其实很简单，就是响应号召，戴口罩，少出门，勤洗手，多消毒，降低自身感染病毒的风险。</p>
</div><div class="cl-preview-section"><p>第五，接受风险，这个分为主动和被动之分：</p>
</div><div class="cl-preview-section"><ul><li>主动：实行远程办公，线上的一些项目都可以采取这种方式，互联网企业是较多的，还有一些自媒体啥的，这些完全可以在家里办公，而且可以利用远程协作工具来开展团队管理。但是也要注意，PM要每天定时跟踪每位团队成员的健康度，比如测量体温，观察身体异常。</li>
<li>被动：这个就没办法了，线下的传统企业几乎都栽进去了，我们必须响应号召，延迟复工，工厂不得开，要开也要得报备审查。如果不行只能停止运作。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w683" style="width:100%;"></li>
</ul></div><div class="cl-preview-section"><p>第六，要提交应急风险变更通知，因为项目整体肯定会受到影响，所以原计划是肯定要做出变动的，比如最大的成本开支，以及预算，都要跟着市场资源做变动，变动了才能有效调控。如果资源没有，或者成本实在太高，影响项目利润，那么就只能暂缓延迟。</p>
</div><div class="cl-preview-section"><h3>不可抗力的风险能否免责</h3>
</div><div class="cl-preview-section"><p>对于类似的不可抗力风险，造成项目滞后，成本超支，项目亏损，企业亏损，能不能获得一定的索赔呢？</p>
</div><div class="cl-preview-section"><p>对于合同规定，是有不可抗力因素的，如果因为这次疫情，是可以免除部分或者全部的责任，比如常规的，延期赔偿100万，那么这个时候100万完全可以免责。合同双方不能对彼此提出索赔等要求。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w1015" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>疫情后的市场机遇</h3>
</div><div class="cl-preview-section"><p>疫情带来巨大影响，也会带来更大的机遇，比如说把一些线下的发展为线上的：</p>
</div><div class="cl-preview-section"><ul><li>游戏
<ul><li>这没啥好说的，不管啥时候都很火，在家没事天天打游戏。</li>
</ul></li>
<li>在线医生
<ul><li>遇到问题，线上诊断，小毛病自己解决，大毛病还是去医院</li>
</ul></li>
<li>社区电商
<ul><li>很多人不出去买菜，有些社区电商崛起了，我朋友从送菜的变成了总代理，吊炸天</li>
</ul></li>
<li>短视频
<ul><li>几亿人的娱乐场所，爸爸妈妈们的茶余饭后</li>
</ul></li>
<li>在线教育
<ul><li>正所谓停课不停学，不去学校上课，老师们在直播间互动啊</li>
</ul></li>
<li>健康管家，生物科学
<ul><li>比如苹果的健康应用，可以检测你的心率啊呼吸啊啥的，如果有问题会提醒你，甚至在你遇到危机的时候自动拨号求救。</li>
</ul></li>
<li>远程办公，异地办公
<ul><li>这个不用多说了，很多人都在家办公，开会、培训，团队协作少不了。</li>
<li>异地办公，这个是长期在家，很多国外公司就是这样，甚至员工分布在各国，每年去总部一次的，也有。</li>
</ul></li>
</ul></div>\n\t\t\t\t\t\t', "/static/demo-normal.png,/static/demo-normal.png", 'Vue,前端', 'basic', 56),
       (14, 1, "React从入门到精通", '\n\t\t\t\t\t\t<div class="cl-preview-section"><p>大家好，我是风间影月，慕课网<a href="https://class.imooc.com/sale/javaarchitect?mc_marking=c6615303b3175f848fccdb52abb833ec&mc_channel=shouji">《Java架构师成长直通车》</a>课程架构师讲师团成员之一。这篇文章我们一起来聊一聊疫情风险管理。</p>
</div><div class="cl-preview-section"><h3>引子</h3>
</div><div class="cl-preview-section"><p>相信大家都经历了疫情，在疫情之下，企业推迟复工，多地封城封路，各行各业都收到了冲击，甚至很多企业都因此倒闭，那么在企业项目管理中，有一点我们需要把控的就是风险管理，遇到风险如何更好的去调控，把损失降低。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w677" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>作为项目经理，应该如何面对，如何处理，如何协调资源，这些都是作为一名PM所需要去考虑的。</p>
</div><div class="cl-preview-section"><p>当各个企业收到延长春节并延迟复工的消息以后，很多企业的项目都停止了，无法正常运作，尤其是一些传统企业收到的打击最大，比如线下物流，工厂等，而互联网企业相对好一些，项目都是在线的，而且大家可以在家远程办公就能整合到一起。（像我们的线下物流就完全停了，对接的工厂端也完全停了，工厂停了，环境监测系统也用不着了，一连串的连带效应）<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w638" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>其实不论线上还是线下，项目进度肯定会延期，资源成本提升，这么一来很多项目都是亏本的，甚至还会因为合同而赔钱。那么这个时候项目就应该不能按照原计划进行，而需要适当进行变更，因为这是外部的不可抗力的因素。项目经理首先最要考虑的就是干系人管理，尤其是你的客户，管理客户，打好招呼，伺候好，维护好现有关系，那么项目上的后续事宜可以更好的开展。</p>
</div><div class="cl-preview-section"><h3>认清风险</h3>
</div><div class="cl-preview-section"><p>一般项目初期在规划项目编撰合同的时候，相关的风险都应该去有所考虑以及有应对的预案，举几个最简单的例子：</p>
</div><div class="cl-preview-section"><ul><li>项目开展过程中人员流动或者疾病风险
<ul><li>招储备人员（外包公司叫做on bench）</li>
<li>激励政策，也就是TeamBuilding，团队融洽度，每月一次TB，每季度一次项目分红（我们是1500/人）</li>
</ul></li>
<li>服务器/硬件设备风险
<ul><li>自建机房要有容灾预案</li>
<li>云服务器要有多地主备</li>
</ul></li>
<li>成本风险
<ul><li>项目中涉及到的采购供应，成本管理需要做好，预算多少，会否超支，有没有可能因为投入越来越多而导致项目亏损，或者盈利不多，需要提前规划和准备。</li>
</ul></li>
<li>第三方风险
<ul><li>一个项目中可能会有20%-40%甚至更多的内容会外包给第三方公司，第三方有没有可能跑路？资质够不够？可以多找几家对比，或者额外找一家做备胎。又或者找两三家一起合作，不把鸡蛋放在一个篮子里。并且要定期验收，定期检查质量。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w911" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><p>那么像这次疫情，不能归类为普通的风险，应该定性为<code>不可抗力风险</code>，因为你预测不到，而且有时候政府的一个突发性政策就会导致项目无法进行（比如我们的物流项目，和政策息息相关，所以我们很多高层每个季度都要去相关部门参加各种培训，甚至一些资质认证的考试。从而伪实时的跟着政策走）。所以应该纳入免责条款，所以合同里应该要写清，如果不写清除，会有后期的各种纠纷。就比如你公司被人炸了，被陨石击中了，这些都是外部的不可抗力，一般人还真遇不到。像N年前，有个哥们车子被陨石击中，保险公司不赔，为啥，因为这是不可抗力因素呀！<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w799" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>如果是平时的风险，一般来说PM或者PMO能去把控或者承担风险责任，但是想这次疫情对所有企业的袭击，就会上升到企业层面，由企业来承当整个公司的风险后果，所有高层都应该出来协调各方项目资源、项目整合、与项目管理。为什么要这么做，这个其实就是统一整合式管理，因为所有的项目全部受影响，就需要统一的整合了，保证一致性。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w764" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>审查风险</h3>
</div><div class="cl-preview-section"><p>分析在这次风险中的各个环节，对比原有计划所存在的出入点。比如：</p>
</div><div class="cl-preview-section"><ul><li>特殊物流运输会减少流量
<ul><li>工厂需求减少</li>
<li>大型物流车停滞所产生的消耗费（一天不开车，每辆亏损上千）</li>
</ul></li>
<li>交通管制导致原有特殊导航系统不可用，油费额外增多</li>
<li>员工需要自我14天隔离的费用</li>
<li>每日口罩成本损耗</li>
<li>远程办公可能会带来的额外成本
<ul><li>微信视频会议等都免费</li>
<li>国外的一些团队协作工具收费<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w600" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><h3>应对风险</h3>
</div><div class="cl-preview-section"><p>不管遇到任何风险，第一个要做的就是上报，注意，不要越级上报，你是PM，你上面有PMO，所要先汇报给PMO，如果没有PMO就汇报给你的直属经理，比如部门经理或者部门总监。在这个过程中，要响应政府号召，比如排查啊隔离啥的，每日体温测量，人员动向，如果有异常情况，也要及时上报。那么作为项目经理，就需要根据实际情况来适当调整原项目进度计划，适当延后，和参与的相关干系人讨论方案，与客户协调沟通。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w701" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>随后，你要看风险是否可控，是否可以规避，常规的你的下属要离职，那么你就去谈谈，能不能挽留，能不能协调公司资源给他涨薪，了解其诉求，解决其诉求。如果是一些额外成本费用，那么可能还是需要通过上报批准，当然如果小成本你要自己解决也行。像这次疫情，对于一些不可继续的项目，只能停止复工，往后延期延迟，硬着头皮偷偷上一旦被查会承担一些法律责任。比如我们有很多车队因为交通管制无法上路，每天每辆车的停车费用有很多，需要和司机和管理处协调，谈判能否降低停车成本，降低企业成本。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w679" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第三，转移风险，降低风险影响，一般来说就是弥补，最常见的就是保险业务。我们每辆车都投了巨大的保额，为啥？因为全国这么多车，一旦发生车祸，人员伤亡，你都处理不过来，这个时候就需要有保险的介入，以此把风险转移给保险公司，以最小的时间人力成本来降低风险。那么对于这次疫情，作为PM，需要回顾一下所有的实体资源，看看是否有一些保险可以弥补一定的损失。我们审查以后，对于司机的健康保险是可以有一定的弥补的，有总比没有好。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w603" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第四，主动降低风险，这个其实很简单，就是响应号召，戴口罩，少出门，勤洗手，多消毒，降低自身感染病毒的风险。</p>
</div><div class="cl-preview-section"><p>第五，接受风险，这个分为主动和被动之分：</p>
</div><div class="cl-preview-section"><ul><li>主动：实行远程办公，线上的一些项目都可以采取这种方式，互联网企业是较多的，还有一些自媒体啥的，这些完全可以在家里办公，而且可以利用远程协作工具来开展团队管理。但是也要注意，PM要每天定时跟踪每位团队成员的健康度，比如测量体温，观察身体异常。</li>
<li>被动：这个就没办法了，线下的传统企业几乎都栽进去了，我们必须响应号召，延迟复工，工厂不得开，要开也要得报备审查。如果不行只能停止运作。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w683" style="width:100%;"></li>
</ul></div><div class="cl-preview-section"><p>第六，要提交应急风险变更通知，因为项目整体肯定会受到影响，所以原计划是肯定要做出变动的，比如最大的成本开支，以及预算，都要跟着市场资源做变动，变动了才能有效调控。如果资源没有，或者成本实在太高，影响项目利润，那么就只能暂缓延迟。</p>
</div><div class="cl-preview-section"><h3>不可抗力的风险能否免责</h3>
</div><div class="cl-preview-section"><p>对于类似的不可抗力风险，造成项目滞后，成本超支，项目亏损，企业亏损，能不能获得一定的索赔呢？</p>
</div><div class="cl-preview-section"><p>对于合同规定，是有不可抗力因素的，如果因为这次疫情，是可以免除部分或者全部的责任，比如常规的，延期赔偿100万，那么这个时候100万完全可以免责。合同双方不能对彼此提出索赔等要求。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w1015" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>疫情后的市场机遇</h3>
</div><div class="cl-preview-section"><p>疫情带来巨大影响，也会带来更大的机遇，比如说把一些线下的发展为线上的：</p>
</div><div class="cl-preview-section"><ul><li>游戏
<ul><li>这没啥好说的，不管啥时候都很火，在家没事天天打游戏。</li>
</ul></li>
<li>在线医生
<ul><li>遇到问题，线上诊断，小毛病自己解决，大毛病还是去医院</li>
</ul></li>
<li>社区电商
<ul><li>很多人不出去买菜，有些社区电商崛起了，我朋友从送菜的变成了总代理，吊炸天</li>
</ul></li>
<li>短视频
<ul><li>几亿人的娱乐场所，爸爸妈妈们的茶余饭后</li>
</ul></li>
<li>在线教育
<ul><li>正所谓停课不停学，不去学校上课，老师们在直播间互动啊</li>
</ul></li>
<li>健康管家，生物科学
<ul><li>比如苹果的健康应用，可以检测你的心率啊呼吸啊啥的，如果有问题会提醒你，甚至在你遇到危机的时候自动拨号求救。</li>
</ul></li>
<li>远程办公，异地办公
<ul><li>这个不用多说了，很多人都在家办公，开会、培训，团队协作少不了。</li>
<li>异地办公，这个是长期在家，很多国外公司就是这样，甚至员工分布在各国，每年去总部一次的，也有。</li>
</ul></li>
</ul></div>\n\t\t\t\t\t\t', "/static/demo-normal.png,/static/demo-normal.png", 'React,前端', 'multi', 86),
       (15, 1, "Android从入门到精通", '\n\t\t\t\t\t\t<div class="cl-preview-section"><p>大家好，我是风间影月，慕课网<a href="https://class.imooc.com/sale/javaarchitect?mc_marking=c6615303b3175f848fccdb52abb833ec&mc_channel=shouji">《Java架构师成长直通车》</a>课程架构师讲师团成员之一。这篇文章我们一起来聊一聊疫情风险管理。</p>
</div><div class="cl-preview-section"><h3>引子</h3>
</div><div class="cl-preview-section"><p>相信大家都经历了疫情，在疫情之下，企业推迟复工，多地封城封路，各行各业都收到了冲击，甚至很多企业都因此倒闭，那么在企业项目管理中，有一点我们需要把控的就是风险管理，遇到风险如何更好的去调控，把损失降低。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w677" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>作为项目经理，应该如何面对，如何处理，如何协调资源，这些都是作为一名PM所需要去考虑的。</p>
</div><div class="cl-preview-section"><p>当各个企业收到延长春节并延迟复工的消息以后，很多企业的项目都停止了，无法正常运作，尤其是一些传统企业收到的打击最大，比如线下物流，工厂等，而互联网企业相对好一些，项目都是在线的，而且大家可以在家远程办公就能整合到一起。（像我们的线下物流就完全停了，对接的工厂端也完全停了，工厂停了，环境监测系统也用不着了，一连串的连带效应）<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w638" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>其实不论线上还是线下，项目进度肯定会延期，资源成本提升，这么一来很多项目都是亏本的，甚至还会因为合同而赔钱。那么这个时候项目就应该不能按照原计划进行，而需要适当进行变更，因为这是外部的不可抗力的因素。项目经理首先最要考虑的就是干系人管理，尤其是你的客户，管理客户，打好招呼，伺候好，维护好现有关系，那么项目上的后续事宜可以更好的开展。</p>
</div><div class="cl-preview-section"><h3>认清风险</h3>
</div><div class="cl-preview-section"><p>一般项目初期在规划项目编撰合同的时候，相关的风险都应该去有所考虑以及有应对的预案，举几个最简单的例子：</p>
</div><div class="cl-preview-section"><ul><li>项目开展过程中人员流动或者疾病风险
<ul><li>招储备人员（外包公司叫做on bench）</li>
<li>激励政策，也就是TeamBuilding，团队融洽度，每月一次TB，每季度一次项目分红（我们是1500/人）</li>
</ul></li>
<li>服务器/硬件设备风险
<ul><li>自建机房要有容灾预案</li>
<li>云服务器要有多地主备</li>
</ul></li>
<li>成本风险
<ul><li>项目中涉及到的采购供应，成本管理需要做好，预算多少，会否超支，有没有可能因为投入越来越多而导致项目亏损，或者盈利不多，需要提前规划和准备。</li>
</ul></li>
<li>第三方风险
<ul><li>一个项目中可能会有20%-40%甚至更多的内容会外包给第三方公司，第三方有没有可能跑路？资质够不够？可以多找几家对比，或者额外找一家做备胎。又或者找两三家一起合作，不把鸡蛋放在一个篮子里。并且要定期验收，定期检查质量。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w911" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><p>那么像这次疫情，不能归类为普通的风险，应该定性为<code>不可抗力风险</code>，因为你预测不到，而且有时候政府的一个突发性政策就会导致项目无法进行（比如我们的物流项目，和政策息息相关，所以我们很多高层每个季度都要去相关部门参加各种培训，甚至一些资质认证的考试。从而伪实时的跟着政策走）。所以应该纳入免责条款，所以合同里应该要写清，如果不写清除，会有后期的各种纠纷。就比如你公司被人炸了，被陨石击中了，这些都是外部的不可抗力，一般人还真遇不到。像N年前，有个哥们车子被陨石击中，保险公司不赔，为啥，因为这是不可抗力因素呀！<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w799" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>如果是平时的风险，一般来说PM或者PMO能去把控或者承担风险责任，但是想这次疫情对所有企业的袭击，就会上升到企业层面，由企业来承当整个公司的风险后果，所有高层都应该出来协调各方项目资源、项目整合、与项目管理。为什么要这么做，这个其实就是统一整合式管理，因为所有的项目全部受影响，就需要统一的整合了，保证一致性。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w764" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>审查风险</h3>
</div><div class="cl-preview-section"><p>分析在这次风险中的各个环节，对比原有计划所存在的出入点。比如：</p>
</div><div class="cl-preview-section"><ul><li>特殊物流运输会减少流量
<ul><li>工厂需求减少</li>
<li>大型物流车停滞所产生的消耗费（一天不开车，每辆亏损上千）</li>
</ul></li>
<li>交通管制导致原有特殊导航系统不可用，油费额外增多</li>
<li>员工需要自我14天隔离的费用</li>
<li>每日口罩成本损耗</li>
<li>远程办公可能会带来的额外成本
<ul><li>微信视频会议等都免费</li>
<li>国外的一些团队协作工具收费<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w600" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><h3>应对风险</h3>
</div><div class="cl-preview-section"><p>不管遇到任何风险，第一个要做的就是上报，注意，不要越级上报，你是PM，你上面有PMO，所要先汇报给PMO，如果没有PMO就汇报给你的直属经理，比如部门经理或者部门总监。在这个过程中，要响应政府号召，比如排查啊隔离啥的，每日体温测量，人员动向，如果有异常情况，也要及时上报。那么作为项目经理，就需要根据实际情况来适当调整原项目进度计划，适当延后，和参与的相关干系人讨论方案，与客户协调沟通。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w701" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>随后，你要看风险是否可控，是否可以规避，常规的你的下属要离职，那么你就去谈谈，能不能挽留，能不能协调公司资源给他涨薪，了解其诉求，解决其诉求。如果是一些额外成本费用，那么可能还是需要通过上报批准，当然如果小成本你要自己解决也行。像这次疫情，对于一些不可继续的项目，只能停止复工，往后延期延迟，硬着头皮偷偷上一旦被查会承担一些法律责任。比如我们有很多车队因为交通管制无法上路，每天每辆车的停车费用有很多，需要和司机和管理处协调，谈判能否降低停车成本，降低企业成本。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w679" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第三，转移风险，降低风险影响，一般来说就是弥补，最常见的就是保险业务。我们每辆车都投了巨大的保额，为啥？因为全国这么多车，一旦发生车祸，人员伤亡，你都处理不过来，这个时候就需要有保险的介入，以此把风险转移给保险公司，以最小的时间人力成本来降低风险。那么对于这次疫情，作为PM，需要回顾一下所有的实体资源，看看是否有一些保险可以弥补一定的损失。我们审查以后，对于司机的健康保险是可以有一定的弥补的，有总比没有好。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w603" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第四，主动降低风险，这个其实很简单，就是响应号召，戴口罩，少出门，勤洗手，多消毒，降低自身感染病毒的风险。</p>
</div><div class="cl-preview-section"><p>第五，接受风险，这个分为主动和被动之分：</p>
</div><div class="cl-preview-section"><ul><li>主动：实行远程办公，线上的一些项目都可以采取这种方式，互联网企业是较多的，还有一些自媒体啥的，这些完全可以在家里办公，而且可以利用远程协作工具来开展团队管理。但是也要注意，PM要每天定时跟踪每位团队成员的健康度，比如测量体温，观察身体异常。</li>
<li>被动：这个就没办法了，线下的传统企业几乎都栽进去了，我们必须响应号召，延迟复工，工厂不得开，要开也要得报备审查。如果不行只能停止运作。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w683" style="width:100%;"></li>
</ul></div><div class="cl-preview-section"><p>第六，要提交应急风险变更通知，因为项目整体肯定会受到影响，所以原计划是肯定要做出变动的，比如最大的成本开支，以及预算，都要跟着市场资源做变动，变动了才能有效调控。如果资源没有，或者成本实在太高，影响项目利润，那么就只能暂缓延迟。</p>
</div><div class="cl-preview-section"><h3>不可抗力的风险能否免责</h3>
</div><div class="cl-preview-section"><p>对于类似的不可抗力风险，造成项目滞后，成本超支，项目亏损，企业亏损，能不能获得一定的索赔呢？</p>
</div><div class="cl-preview-section"><p>对于合同规定，是有不可抗力因素的，如果因为这次疫情，是可以免除部分或者全部的责任，比如常规的，延期赔偿100万，那么这个时候100万完全可以免责。合同双方不能对彼此提出索赔等要求。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w1015" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>疫情后的市场机遇</h3>
</div><div class="cl-preview-section"><p>疫情带来巨大影响，也会带来更大的机遇，比如说把一些线下的发展为线上的：</p>
</div><div class="cl-preview-section"><ul><li>游戏
<ul><li>这没啥好说的，不管啥时候都很火，在家没事天天打游戏。</li>
</ul></li>
<li>在线医生
<ul><li>遇到问题，线上诊断，小毛病自己解决，大毛病还是去医院</li>
</ul></li>
<li>社区电商
<ul><li>很多人不出去买菜，有些社区电商崛起了，我朋友从送菜的变成了总代理，吊炸天</li>
</ul></li>
<li>短视频
<ul><li>几亿人的娱乐场所，爸爸妈妈们的茶余饭后</li>
</ul></li>
<li>在线教育
<ul><li>正所谓停课不停学，不去学校上课，老师们在直播间互动啊</li>
</ul></li>
<li>健康管家，生物科学
<ul><li>比如苹果的健康应用，可以检测你的心率啊呼吸啊啥的，如果有问题会提醒你，甚至在你遇到危机的时候自动拨号求救。</li>
</ul></li>
<li>远程办公，异地办公
<ul><li>这个不用多说了，很多人都在家办公，开会、培训，团队协作少不了。</li>
<li>异地办公，这个是长期在家，很多国外公司就是这样，甚至员工分布在各国，每年去总部一次的，也有。</li>
</ul></li>
</ul></div>\n\t\t\t\t\t\t', "/static/demo-normal.png,/static/demo-normal.png", '前端,Android', 'basic', 37),
       (16, 1, "IOS从入门到精通", '\n\t\t\t\t\t\t<div class="cl-preview-section"><p>大家好，我是风间影月，慕课网<a href="https://class.imooc.com/sale/javaarchitect?mc_marking=c6615303b3175f848fccdb52abb833ec&mc_channel=shouji">《Java架构师成长直通车》</a>课程架构师讲师团成员之一。这篇文章我们一起来聊一聊疫情风险管理。</p>
</div><div class="cl-preview-section"><h3>引子</h3>
</div><div class="cl-preview-section"><p>相信大家都经历了疫情，在疫情之下，企业推迟复工，多地封城封路，各行各业都收到了冲击，甚至很多企业都因此倒闭，那么在企业项目管理中，有一点我们需要把控的就是风险管理，遇到风险如何更好的去调控，把损失降低。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w677" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>作为项目经理，应该如何面对，如何处理，如何协调资源，这些都是作为一名PM所需要去考虑的。</p>
</div><div class="cl-preview-section"><p>当各个企业收到延长春节并延迟复工的消息以后，很多企业的项目都停止了，无法正常运作，尤其是一些传统企业收到的打击最大，比如线下物流，工厂等，而互联网企业相对好一些，项目都是在线的，而且大家可以在家远程办公就能整合到一起。（像我们的线下物流就完全停了，对接的工厂端也完全停了，工厂停了，环境监测系统也用不着了，一连串的连带效应）<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w638" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>其实不论线上还是线下，项目进度肯定会延期，资源成本提升，这么一来很多项目都是亏本的，甚至还会因为合同而赔钱。那么这个时候项目就应该不能按照原计划进行，而需要适当进行变更，因为这是外部的不可抗力的因素。项目经理首先最要考虑的就是干系人管理，尤其是你的客户，管理客户，打好招呼，伺候好，维护好现有关系，那么项目上的后续事宜可以更好的开展。</p>
</div><div class="cl-preview-section"><h3>认清风险</h3>
</div><div class="cl-preview-section"><p>一般项目初期在规划项目编撰合同的时候，相关的风险都应该去有所考虑以及有应对的预案，举几个最简单的例子：</p>
</div><div class="cl-preview-section"><ul><li>项目开展过程中人员流动或者疾病风险
<ul><li>招储备人员（外包公司叫做on bench）</li>
<li>激励政策，也就是TeamBuilding，团队融洽度，每月一次TB，每季度一次项目分红（我们是1500/人）</li>
</ul></li>
<li>服务器/硬件设备风险
<ul><li>自建机房要有容灾预案</li>
<li>云服务器要有多地主备</li>
</ul></li>
<li>成本风险
<ul><li>项目中涉及到的采购供应，成本管理需要做好，预算多少，会否超支，有没有可能因为投入越来越多而导致项目亏损，或者盈利不多，需要提前规划和准备。</li>
</ul></li>
<li>第三方风险
<ul><li>一个项目中可能会有20%-40%甚至更多的内容会外包给第三方公司，第三方有没有可能跑路？资质够不够？可以多找几家对比，或者额外找一家做备胎。又或者找两三家一起合作，不把鸡蛋放在一个篮子里。并且要定期验收，定期检查质量。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w911" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><p>那么像这次疫情，不能归类为普通的风险，应该定性为<code>不可抗力风险</code>，因为你预测不到，而且有时候政府的一个突发性政策就会导致项目无法进行（比如我们的物流项目，和政策息息相关，所以我们很多高层每个季度都要去相关部门参加各种培训，甚至一些资质认证的考试。从而伪实时的跟着政策走）。所以应该纳入免责条款，所以合同里应该要写清，如果不写清除，会有后期的各种纠纷。就比如你公司被人炸了，被陨石击中了，这些都是外部的不可抗力，一般人还真遇不到。像N年前，有个哥们车子被陨石击中，保险公司不赔，为啥，因为这是不可抗力因素呀！<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w799" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>如果是平时的风险，一般来说PM或者PMO能去把控或者承担风险责任，但是想这次疫情对所有企业的袭击，就会上升到企业层面，由企业来承当整个公司的风险后果，所有高层都应该出来协调各方项目资源、项目整合、与项目管理。为什么要这么做，这个其实就是统一整合式管理，因为所有的项目全部受影响，就需要统一的整合了，保证一致性。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w764" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>审查风险</h3>
</div><div class="cl-preview-section"><p>分析在这次风险中的各个环节，对比原有计划所存在的出入点。比如：</p>
</div><div class="cl-preview-section"><ul><li>特殊物流运输会减少流量
<ul><li>工厂需求减少</li>
<li>大型物流车停滞所产生的消耗费（一天不开车，每辆亏损上千）</li>
</ul></li>
<li>交通管制导致原有特殊导航系统不可用，油费额外增多</li>
<li>员工需要自我14天隔离的费用</li>
<li>每日口罩成本损耗</li>
<li>远程办公可能会带来的额外成本
<ul><li>微信视频会议等都免费</li>
<li>国外的一些团队协作工具收费<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w600" style="width:100%;"></li>
</ul></li>
</ul></div><div class="cl-preview-section"><h3>应对风险</h3>
</div><div class="cl-preview-section"><p>不管遇到任何风险，第一个要做的就是上报，注意，不要越级上报，你是PM，你上面有PMO，所要先汇报给PMO，如果没有PMO就汇报给你的直属经理，比如部门经理或者部门总监。在这个过程中，要响应政府号召，比如排查啊隔离啥的，每日体温测量，人员动向，如果有异常情况，也要及时上报。那么作为项目经理，就需要根据实际情况来适当调整原项目进度计划，适当延后，和参与的相关干系人讨论方案，与客户协调沟通。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w701" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>随后，你要看风险是否可控，是否可以规避，常规的你的下属要离职，那么你就去谈谈，能不能挽留，能不能协调公司资源给他涨薪，了解其诉求，解决其诉求。如果是一些额外成本费用，那么可能还是需要通过上报批准，当然如果小成本你要自己解决也行。像这次疫情，对于一些不可继续的项目，只能停止复工，往后延期延迟，硬着头皮偷偷上一旦被查会承担一些法律责任。比如我们有很多车队因为交通管制无法上路，每天每辆车的停车费用有很多，需要和司机和管理处协调，谈判能否降低停车成本，降低企业成本。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w679" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第三，转移风险，降低风险影响，一般来说就是弥补，最常见的就是保险业务。我们每辆车都投了巨大的保额，为啥？因为全国这么多车，一旦发生车祸，人员伤亡，你都处理不过来，这个时候就需要有保险的介入，以此把风险转移给保险公司，以最小的时间人力成本来降低风险。那么对于这次疫情，作为PM，需要回顾一下所有的实体资源，看看是否有一些保险可以弥补一定的损失。我们审查以后，对于司机的健康保险是可以有一定的弥补的，有总比没有好。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w603" style="width:100%;"></p>
</div><div class="cl-preview-section"><p>第四，主动降低风险，这个其实很简单，就是响应号召，戴口罩，少出门，勤洗手，多消毒，降低自身感染病毒的风险。</p>
</div><div class="cl-preview-section"><p>第五，接受风险，这个分为主动和被动之分：</p>
</div><div class="cl-preview-section"><ul><li>主动：实行远程办公，线上的一些项目都可以采取这种方式，互联网企业是较多的，还有一些自媒体啥的，这些完全可以在家里办公，而且可以利用远程协作工具来开展团队管理。但是也要注意，PM要每天定时跟踪每位团队成员的健康度，比如测量体温，观察身体异常。</li>
<li>被动：这个就没办法了，线下的传统企业几乎都栽进去了，我们必须响应号召，延迟复工，工厂不得开，要开也要得报备审查。如果不行只能停止运作。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w683" style="width:100%;"></li>
</ul></div><div class="cl-preview-section"><p>第六，要提交应急风险变更通知，因为项目整体肯定会受到影响，所以原计划是肯定要做出变动的，比如最大的成本开支，以及预算，都要跟着市场资源做变动，变动了才能有效调控。如果资源没有，或者成本实在太高，影响项目利润，那么就只能暂缓延迟。</p>
</div><div class="cl-preview-section"><h3>不可抗力的风险能否免责</h3>
</div><div class="cl-preview-section"><p>对于类似的不可抗力风险，造成项目滞后，成本超支，项目亏损，企业亏损，能不能获得一定的索赔呢？</p>
</div><div class="cl-preview-section"><p>对于合同规定，是有不可抗力因素的，如果因为这次疫情，是可以免除部分或者全部的责任，比如常规的，延期赔偿100万，那么这个时候100万完全可以免责。合同双方不能对彼此提出索赔等要求。<br><img class="lazyload" src="http://localhost:7000/static/demo-normal.png" alt="-w1015" style="width:100%;"></p>
</div><div class="cl-preview-section"><h3>疫情后的市场机遇</h3>
</div><div class="cl-preview-section"><p>疫情带来巨大影响，也会带来更大的机遇，比如说把一些线下的发展为线上的：</p>
</div><div class="cl-preview-section"><ul><li>游戏
<ul><li>这没啥好说的，不管啥时候都很火，在家没事天天打游戏。</li>
</ul></li>
<li>在线医生
<ul><li>遇到问题，线上诊断，小毛病自己解决，大毛病还是去医院</li>
</ul></li>
<li>社区电商
<ul><li>很多人不出去买菜，有些社区电商崛起了，我朋友从送菜的变成了总代理，吊炸天</li>
</ul></li>
<li>短视频
<ul><li>几亿人的娱乐场所，爸爸妈妈们的茶余饭后</li>
</ul></li>
<li>在线教育
<ul><li>正所谓停课不停学，不去学校上课，老师们在直播间互动啊</li>
</ul></li>
<li>健康管家，生物科学
<ul><li>比如苹果的健康应用，可以检测你的心率啊呼吸啊啥的，如果有问题会提醒你，甚至在你遇到危机的时候自动拨号求救。</li>
</ul></li>
<li>远程办公，异地办公
<ul><li>这个不用多说了，很多人都在家办公，开会、培训，团队协作少不了。</li>
<li>异地办公，这个是长期在家，很多国外公司就是这样，甚至员工分布在各国，每年去总部一次的，也有。</li>
</ul></li>
</ul></div>\n\t\t\t\t\t\t', "/static/demo-normal.png,/static/demo-normal.png", 'IOS,前端', 'basic', 27);

INSERT INTO `r_user_like_article`(id, user_id, article_id)
VALUES (1, 1, 1),
       (2, 1, 2),
       (3, 1, 3);