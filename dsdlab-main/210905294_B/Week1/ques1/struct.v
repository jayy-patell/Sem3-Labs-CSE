module struct(a,b,c,d,f);
input a,b,c,d;
output f;
and(k1,a,b);
and(k2,a,b);
or(m1,c,k1);
or(m2,c,k2);
and(t1,~m1,d);
or(t2,m2,d);
and(f,t1,t2);
endmodule