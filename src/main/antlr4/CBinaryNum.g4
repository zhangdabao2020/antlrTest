grammar CBinaryNum;

binaryNum  : binarydig  '.'  fractiondig ;

fractiondig  :  fractiondig bit #xiaoshu
| bit  #danti0
 ;
binarydig   :    binarydig bit  #zhengshu
| bit #danti1
;
 bit     : LING   #zero
  | YI  #one
   ;
 LING:'0';
 YI : '1';
 WS : [ \r\n\t] + -> skip
   ;
