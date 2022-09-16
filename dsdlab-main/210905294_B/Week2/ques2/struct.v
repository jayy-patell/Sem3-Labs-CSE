module struct(a,b,c,d,f);
input a,b,c,d;
output f;
or(t1,~b,c,d);
or(t2,~a,c,~d);
or(t3,a,~c,d);
or(t4,~c,~a,b);
and(f,t1,t2,t3,t4);

// assign f1=((~b|c|d)&(~a|~d|c)&(a|~c|d)&(~c|~a|b));
endmodule