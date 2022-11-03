module q3(w, En, f);
    input [2:0] w;
    input En;
    output f;
    wire [0:7] y;

    dec decoder(w, En, y);
    assign f = y[3] | y[5] | y[6];
endmodule

module dec(w, En, y);
    input [2:0] w;
    input En;
    output [0:7] y;

    wire t1,t2;
    assign t1 = ~w[2] & En;
    assign t2 = w[2] & En;

    ttfd stage0(w[1:0],t1,y[0:3]);
    ttfd stage1(w[1:0],t2,y[4:7]);
endmodule

module ttfd(w,En,y);
    input [1:0] w;
    input En;
    output reg [0:3] y;
    always @(w or En)
    begin
            y=4'b0000;
        if (En == 1)
        begin
            case(w)
            0:  y[0] = 1;
            1:  y[1] = 1;
            2:  y[2] = 1;
            3:  y[3] = 1; 
            endcase
        end
    end
endmodule