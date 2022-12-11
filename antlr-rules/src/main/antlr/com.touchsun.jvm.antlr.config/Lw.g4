// 语言声明

grammar Lw;

// 解析规则

// 根规则 - 根规则中仅仅包含 variable print 此处为前置声明,下面会给出声明的具体定义
// - EOF: 文件结尾
// - VARIABLE: 声明类型
// - ID: 变量名
// - EQUALS: 等于指令
// - PRINT: 打印指令
// - NUMBER: 数字
// - STRING: 字符串
// - WS: 空格/TAB/换行等空内容
compilationUnit : ( variable | print )* EOF;
// variable的定义 - 其后必须为 VARIABLE,ID,EQUALS 以及 value定义的内容
variable : VARIABLE ID EQUALS value;
// print的定义 - 其后必须为'print'关键字及ID
print : PRINT ID ;
// value的定义 - 涵盖String/Number类型内容
value : NUMBER | STRING ;

// 词法分析器规则

// var与VARIABLE匹配
VARIABLE : 'var' ;
// print与PRINT匹配
PRINT : 'print' ;
// '='与EQUALS匹配
EQUALS : '=' ;
// 正则'数字'与NUMBER匹配
NUMBER : [0-9]+ ;
// 正则'双/单引号之间的内容'与STRING匹配
STRING : ('"'.)*'"' ;
// 正则'任何数字与字母的组合'与ID匹配
ID : [a-zA-Z0-9]+ ;
// 对正则'空格/换行'等空内容做跳过处理
WS : [ \t\n\r]+ -> skip ;

