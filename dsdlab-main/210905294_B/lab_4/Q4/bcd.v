`include "fba.v"
module bcd(c_in,x,y,s,c_out);
input c_in;
input [3:0]x,y;
wire [3:0]z,k;
wire c1,c2;
output [3:0]s;
output c_out;
fba stage0(c_in,x,y,z,c1);
assign c_out = c1|(z[3]&z[2])|(z[3]&z[1]);
assign k[0] = 0,k[1] = c_out,k[2] = c_out,k[3] = 0;
fba stage1(c_in,k,z,s,c2);
endmodule

