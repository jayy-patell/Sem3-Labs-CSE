`include "full_adder.v"
module fba(c_in,x,y,s,c_out);
input c_in;
input [3:0]x,y;
output [3:0]s;
wire c[2:0];
output c_out;
full_adder stage0(c_in,x[0],y[0]^c_in,s[0],c[0]);
full_adder stage1(c[0],x[1],y[1]^c_in,s[1],c[1]);
full_adder stage2(c[1],x[2],y[2]^c_in,s[2],c[2]);
full_adder stage3(c[2],x[3],y[3]^c_in,s[3],c_out);
endmodule

