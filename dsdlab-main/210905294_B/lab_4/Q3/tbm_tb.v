`timescale 1ns/1ns
`include "tbm.v"
 module tbm_tb;
 reg [1:0]x,y;
 wire [3:0]p;

tbm uut(x,y,p);
 initial begin
 
 $dumpfile("tbm_tb.vcd");
 $dumpvars(0,tbm_tb);
 x = {1'b1,1'b1};
 y = {1'b1,1'b1};
 #20;
 x = {1'b1,1'b1};
 y = {1'b1,1'b0};
 #20;
 $display("test complete");
 end
 
 endmodule
