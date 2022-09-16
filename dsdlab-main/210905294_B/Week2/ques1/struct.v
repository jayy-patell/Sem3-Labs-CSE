module struct(a,b,c,d,f);
input a,b,c,d;
output f;
wire 
and(t1,~b,c);
and(t2,c,d);
and(t3,~a,b);
and(t4,b,~c,d);
or(f,t1,t2,t3,t4);

assign f1 = ((c&d)|(b&~c&~d)|(~a&b)|(c&~b));
endmodule