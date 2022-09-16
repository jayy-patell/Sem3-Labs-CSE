`timescale 1ns/1ns
`include "struct.v"

module struct_tb;
reg x1,x2,x3,x4;
wire f,f1;

struct uut(x1,x2,x3,x4,f,f1);
initial begin

	$dumpfile("struct_tb.vcd");
	$dumpvars(0,struct_tb);

	x1=0;
	x2=0;
	x3=0;
	x4=0;
	#20;

	x1=0;
	x2=1;
	x3=0;
	x4=0;
	#20;

	x1=0;
	x2=0;
	x3=1;
	x4=0;
	#20;

	x1=0;
	x2=0;
	x3=0;
	x4=1;
	#20;

	x1=1;
	x2=0;
	x3=0;
	x4=0;
	#20;


	x1=1;
	x2=1;
	x3=0;
	x4=0;
	#20;

	x1=1;
	x2=0;
	x3=1;
	x4=0;
	#20;

	x1=1;
	x2=0;
	x3=0;
	x4=1;
	#20;

	x1=0;
	x2=0;
	x3=1;
	x4=1;
	#20;

	x1=0;
	x2=1;
	x3=0;
	x4=1;
	#20;

	x1=0;
	x2=1;
	x3=1;
	x4=0;
	#20;


	x1=1;
	x2=1;
	x3=1;
	x4=0;
	#20;

	x1=1;
	x2=1;
	x3=0;
	x4=1;
	#20;

	x1=1;
	x2=0;
	x3=1;
	x4=1;
	#20;

	x1=0;
	x2=1;
	x3=1;
	x4=1;
	#20;

	x1=1;
	x2=1;
	x3=1;
	x4=1;
	#20;

	$display("Test Complete");

end


endmodule