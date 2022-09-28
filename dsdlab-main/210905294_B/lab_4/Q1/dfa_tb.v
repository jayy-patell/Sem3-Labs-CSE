`timescale 1ns/1ns
`include "dfa.v"
 module dfa_tb;
 
 reg x,y,c_in;
 wire s,c_out;

dfa uut(x,y,c_in,s,c_out);
 initial begin
 
 $dumpfile("dfa_tb.vcd");
 $dumpvars(0,dfa_tb);
 
x=0;
y=0;
c_in=0;
#20;

x=0;
y=0;
c_in=1;
#20;

x=0;
y=1;
c_in=0;
#20;

x=0;
y=1;
c_in=1;
#20;

x=1;
y=0;
c_in=0;
#20;

x=1;
y=0;
c_in=1;
#20;

x=1;
y=1;
c_in=0;
#20;

x=1;
y=1;
c_in=1;
#20;
 
 $display("test complete");
 end
 
 endmodule
