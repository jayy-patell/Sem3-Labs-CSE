`timescale 1ns/1ns
`include "q3.v"

module q3_tb();
reg [2:0] w;
reg En;
wire f;

q3 q(w,En,f);
initial
begin
    $dumpfile("q3_tb.vcd");
    $dumpvars(0,q3_tb);

    w = 3'b000; En = 1; #20;
    w = 3'b001; En = 1; #20;
    w = 3'b010; En = 1; #20;
	w = 3'b011; En = 1; #20;
	w = 3'b100; En = 1; #20;
	w = 3'b101; En = 1; #20;
	w = 3'b110; En = 1; #20;
	w = 3'b111; En = 1; #20;

    $display("Test Complete");

end
endmodule