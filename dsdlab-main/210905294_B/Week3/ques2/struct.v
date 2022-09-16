module struct(a,b,c,d,f);
input a,b,c,d;
output f;

nor(t1,a,a);
nor(t2,b,b);
nor(t3,c,c);
nor(t4,d,d);
nor(t5,t1,t2);
nor(t6,t3,t4);
nor(t7,d,t2);
nor(f,t5,t6,t7);

endmodule