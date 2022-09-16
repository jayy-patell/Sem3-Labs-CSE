module example(a,b,c,d,f,f1);
input a,b,c,d;
output f,f1;
or(t1,~b,d);
or(t2,b,c);
and(f,t1,t2);

assign f1 = ((c|b)&(d|~b));
endmodule