##### 面向对象的编程，并不是类越多越好，类的划分是为了封装，但分类的基础是抽象，具有相同属性和功能的对象的抽象集合才是类。

### 定义
> 它定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化，不会影响到使用算法的客户

> 策略模式是一种定义一系列算法的方法，从概念上来看，所有这些算法完成的都是相同的工作，只是实现不同，它可以以相同的方式调用所有的算法，减少了各种算法类与使用算法类之间的耦合

### 优点
> 策略模式的Strategy类层次为Context定义了一系列的可供重用的算法或行为。

> 简化了单元测试，因为每个算法都有自己的类，可以通过自己的接口单独测试

### 结构图

![image](https://note.youdao.com/yws/public/resource/8efcc1161b478effaeae0b3f767aaaf9/xmlnote/9B8EF7C0042949639091F54C84A7B2B8/4328)

![image](https://note.youdao.com/yws/public/resource/8efcc1161b478effaeae0b3f767aaaf9/xmlnote/9ABE1A7827554482A72879AB883E49B1/4330)