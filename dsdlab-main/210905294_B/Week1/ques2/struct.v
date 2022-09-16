module struct(a,b,c,d,f,g);
input a,b,c,d;
output f,g;
nand(k1,a,b);
nor(g,b,c,d);
xor(f,d,k1,c);
endmodule