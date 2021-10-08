grammar RealNumber;

realnum  : intnum  '.'  dicinum ;

dicinum  :  dicinum num  #xiaoshu
| num   #danti0
 ;
intnum   :    intnum num  #zhengshu
| num #danti1
;
num : NUM;
 NUM  : [0-9]
   ;
 WS : [ \r\n\t] + -> skip
   ;


