`include "full_adder.v"

module tbm(x,y,p);
input [1:0]x,y;
output [3:0]p;
wire [1:0]k;
wire [1:0]l;
wire [1:0]m;
assign k = {1'b0,x[1]&y[0]};
assign l = {x[1]&y[1],x[0]&y[1]};
assign p[0] = x[0]&y[0];
tba stage0(1'b0,k,l,m,p[3]);
assign p[1] = m[0];
assign p[2] = m[1];
endmodule

module tba(c_in,x,y,s,c_out);
input c_in;
input [1:0]x,y;
output [1:0]s;
wire c;
output c_out;
full_adder stage0(c_in,x[0],y[0],s[0],c);
full_adder stage1(c,x[1],y[1],s[1],c_out);
endmodule
