`timescale 1ns/1ns
`include "q1.v"

module q1_tb();
reg [3:0] w;
reg En;
wire f;

q1 q(w,En,f);
initial
begin
    $dumpfile("q1_tb.vcd");
    $dumpvars(0,q1_tb);

    w = 0; En = 1; #20;
    w = 1; En = 1; #20;
    w = 2; En = 1; #20;
    w = 3; En = 1; #20;

    $display("Test Complete");

end
endmodule