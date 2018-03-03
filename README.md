# ZpMoreItemDemo
复杂的多类型条目列表动态配置的实现

应用场景：
01、首页页面复杂类型条目动态配置
02、聊天页面复杂类型条目动态配置
03、商品详情复杂类型条目动态配置

原理：本质上是对RecyclerView 和 ListView 的封装


效果图：
![](https://github.com/0119zp/ZpMoreItemDemo/blob/master/device-2018-03-03-223637.png)
![](https://github.com/0119zp/ZpMoreItemDemo/blob/master/device-2018-03-03-223735.png)


布局中紧紧只有一个 RecyclerView ，每一个类型模块都是以一个条目添加到RecyclerView中，后台只需要控制要显示的模块类型就能动态控制页面模块的显示。
