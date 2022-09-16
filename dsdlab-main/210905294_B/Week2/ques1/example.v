module example(a,b,c,d,f);
input a,b,c,d;
output f;
and(r1,b,~c,~d);
and(r2,~b,c);
and(r3,~b,d);
or(f,r1,r2,r3);

// assign f1 = (b&~c&~d)|(~b&c)|(~b&d);
endmodule