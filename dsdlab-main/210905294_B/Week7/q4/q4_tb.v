`timescale 1ns/1ns
`include "q4.v"

module q4_tb();
reg [(3):0] g;
wire [(3):0] b;

q4 gtb(g,b);
initial begin
    $dumpfile("q4_tb.vcd");
    $dumpvars(0,q4_tb);

    g = 4'b0011; #20; //desired output is 0010
    g = 4'b0110; #20; //desired output is 0100

    $display("Test Complete");    
end
endmodule