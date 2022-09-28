`timescale 1ns/1ns
`include "full_adder.v"
module full_adder_tb;
reg a,b,c_in;
wire s,c;
full_adder uut(a,b,c_in,s,c);
initial
begin
$dumpfile("full_adder_tb.vcd");
$dumpvars(0,full_adder_tb);
c_in=0;
a=0;b=0;#20;
a=0;b=1;#20;
a=1;b=0;#20;
a=1;b=1;#20;
c_in=1;
a=0;b=0;#20;
a=0;b=1;#20;
a=1;b=0;#20;
a=1;b=1;#20;

$display("Test completed");
end
endmodule
