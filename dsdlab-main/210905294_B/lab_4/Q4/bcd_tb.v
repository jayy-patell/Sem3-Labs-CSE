`timescale 1ns/1ns
`include "bcd.v"
 module bcd_tb;
 reg c_in;
 reg [3:0]x,y;
 wire [3:0]s;
 wire c_out;

bcd uut(c_in,x,y,s,c_out);
 initial begin
 
 $dumpfile("bcd.vcd");
 $dumpvars(0,bcd_tb);
 c_in = 0;
 x = 5;
 y = 6;
 #20;
  c_in = 0;
 x = 6;
 y = 7;
 #20;
 $display("test complete");
 end
 
 endmodule
