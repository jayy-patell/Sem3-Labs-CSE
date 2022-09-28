`include "half_adder.v"
module dfa(x,y,c_in,s,c_out);
input x,y,c_in;
output s,c_out;
wire c0,c1;
half_adder stage0(x,y,s0,c0);
half_adder stage1(s0,c_in,s,c1);
assign c_out = (c0|c1);
endmodule

