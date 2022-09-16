module struct(a,b,c,d,e,f);
input a,b,c,d,e;
output f;

assign g =(~a|b)&e;
nor(t,c,d);
assign f = (g&t)|(c&d&(~g));

endmodule