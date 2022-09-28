`timescale 1ns/1ns
`include "fbsa.v"
 module fbsa_tb;
 reg c_in;
 reg [3:0]x,y;
 wire [3:0]s;
 wire c_out;

fbsa uut(c_in,x,y,s,c_out);
 initial begin
 
 $dumpfile("fbsa.vcd");
 $dumpvars(0,fbsa_tb);
 c_in = 0;
 x = 4'b0100;
 y = 4'b0010;
 #20;
  c_in = 1;
 x = 4'b0100;
 y = 4'b0010;
 #20;
 $display("test complete");
 end
 
 endmodule
