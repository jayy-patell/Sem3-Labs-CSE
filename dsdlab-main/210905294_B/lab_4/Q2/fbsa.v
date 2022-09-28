`include "full_adder.v"
module fbsa(c_in,x,y,s,c_out);
input c_in;
input [3:0]x,y;
output [3:0]s;
wire [3:0]y1;
wire c[2:0];
output c_out;
assign y1[3] = y[3]^c_in,y1[2] = y[2]^c_in,y1[1] = y[1]^c_in,y1[0] = y[0]^c_in;
fba stage0(c_in,x,y1,s,c_out);
endmodule
module fba(c_in,x,y,s,c_out);
input c_in;
input [3:0]x,y;
output [3:0]s;
wire c[2:0];
output c_out;
full_adder stage0(c_in,x[0],y[0],s[0],c[0]);
full_adder stage1(c[0],x[1],y[1],s[1],c[1]);
full_adder stage2(c[1],x[2],y[2],s[2],c[2]);
full_adder stage3(c[2],x[3],y[3],s[3],c_out);
endmodule

