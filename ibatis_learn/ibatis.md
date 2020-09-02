# IBatis

## 一. 功能流程层次描述的架构图

![mybatis架构图](https://images0.cnblogs.com/blog/571766/201405/202018414812997.png)

## 二. 源码包对应的架构图

![源码包架构图](https://images0.cnblogs.com/blog/571766/201405/202018523246078.png)

## 三. 核心类解释

**SqlSessionFactory：**

每个基于 MyBatis 的应用都是以一个 SqlSessionFactory 的实例为中心的。
SqlSessionFactory 的实例可以通过 SqlSessionFactoryBuilder 获得。而 SqlSessionFactoryBuilder 则可以从 XML 配置文件或通过Java的方式构建出 SqlSessionFactory 的实例。
SqlSessionFactory 一旦被创建就应该在应用的运行期间一直存在，建议使用单例模式或者静态单例模式。
一个SqlSessionFactory对应配置文件中的一个环境（environment），如果你要使用多个数据库就配置多个环境分别对应一个SqlSessionFactory。

**SqlSession：**

SqlSession是一个接口，它有2个实现类，分别是DefaultSqlSession(默认使用)以及SqlSessionManager。
SqlSession通过内部存放的执行器（Executor）来对数据进行CRUD。
此外SqlSession不是线程安全的，因为每一次操作完数据库后都要调用close对其进行关闭，官方建议通过try-finally来保证总是关闭SqlSession。

**Executor：**

Executor（执行器）接口有两个实现类:CachingExecutor和BaseExecutor
BaseExecutor有三个继承类分别是
1.BatchExecutor（重用语句并执行批量更新）
2.ReuseExecutor（重用预处理语句prepared statement，跟Simple的唯一区别就是内部缓存statement)
3.SimpleExecutor（默认，每次都会创建新的statement）。

以上三个就是主要的Executor。
通过下图可以看到Mybatis在Executor的设计上面使用了装饰器模式.
我们可以用CachingExecutor来装饰前面的三个执行器目的就是用来实现缓存。

![Excutor](https://img-blog.csdnimg.cn/20200614124252112.png)

**MappedStatement：**

MappedStatement就是用来存放我们SQL映射文件中的信息包括sql语句，输入参数，输出参数等等。一个SQL节点对应一个MappedStatement对象。

![](https://img-blog.csdnimg.cn/20200614124223299.png)

## 四.iBatis源码-配置信息获取

