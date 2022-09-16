module struct(a,b,c,d,f);
input a,b,c,d;
output f;

nand(t1,b,b);
nand(t2,t1,a);
nand(t3,d,d);
nand(t4,t3,c);
nand(t5,t2,t4);
nand(f,t5,t5);

endmodule