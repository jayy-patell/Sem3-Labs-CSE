`timescale 1ns/1ns
`include "struct.v"

module struct_tb;
reg a,b,c,d;
wire f;

struct uut(a,b,c,d,f);
initial begin

	$dumpfile("struct_tb.vcd");
	$dumpvars(0,struct_tb);

	a=0;b=0;c=0;d=0;
	#10;
	a=0;b=1;c=0;d=0;
	#10;
	a=0;b=0;c=1;d=0;
	#10;
	a=0;b=0;c=0;d=1;
	#10;
	a=1;b=0;c=0;d=0;
	#10;
	a=1;b=1;c=0;d=0;
	#10;
	a=1;b=0;c=1;d=0;
	#10;
	a=1;b=0;c=0;d=1;
	#10;
	a=0;b=0;c=1;d=1;
	#10;
	a=0;b=1;c=0;d=1;
	#10;
	a=0;b=1;c=1;d=0;
	#10;
	a=1;b=1;c=1;d=0;
	#10;
	a=1;b=1;c=0;d=1;
	#10;
	a=1;b=0;c=1;d=1;
	#10;
	a=0;b=1;c=1;d=1;
	#10;
	a=1;b=1;c=1;d=1;
	#10;

	$display("Test Complete");

end


endmodule