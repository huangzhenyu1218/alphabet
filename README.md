# 项目说明文档
使用策略模式,AggregationAlphabet.java聚合策略,UnRepeatAlphabet.java去重策略  
测试用例AggregationAlphabetTest.java、UnRepeatAlphabetTest.java  
使用正则表达式提取字符串  
使用jdk8  

<!-- ![项目文件树](src/demo.png) -->
### 项目文件树
```
.
│  pom.xml
│  README.md
│
└─src
    ├─main
    │  ├─java
    │  │  └─io
    │  │      └─github
    │  │          └─alphabet
    │  │                  AggregationAlphabet.java
    │  │                  Alphabet.java
    │  │                  AlphabetContext.java
    │  │                  Application.java
    │  │                  UnRepeatAlphabet.java
    │  │
    │  └─resources
    └─test
        └─java
            └─io
                └─github
                    └─alphabet
                            AggregationAlphabetTest.java
                            UnRepeatAlphabetTest.java

12 directories, 9 files

```

### 项目启动说明

```
在IntelliJ Idea Run/Debug： 
Application.java
AggregationAlphabetTest.java
UnRepeatAlphabetTest.java
```
### 版本更新说明
- 改为策略模式