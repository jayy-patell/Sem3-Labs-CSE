
module q1(input [3:0] W, input En,output f);
	wire [0:15] Y;
	dec4to16 decoder(W, En, Y);
	assign f=Y[1] | Y[3] | Y[6] | Y[7] | Y[9] | Y[14] | Y[15];
endmodule

module dec4to16 (input [3:0] W, input En, output [0:15] Y);
	wire t1, t2;
    assign t1 = ~W[3] & En;
    assign t2 = W[3] & En;
	dec3to8 stage0(W[2:0], Y[0:7], t1);
    dec3to8 stage1(W[2:0], Y[8:15], t2);
endmodule

module dec3to8 (W, Y, En);
	input [2:0] W;
	input En;
	output [0:7] Y;
	reg [0:7] Y;
	always @(W or En)
	begin
		if (En == 0)
			Y = 8'b00000000;
		else
			case (W)
				0: Y = 8'b10000000;
				1: Y = 8'b01000000;
				2: Y = 8'b00100000;
				3: Y = 8'b00010000;
				4: Y = 8'b00001000;
				5: Y = 8'b00000100;
				6: Y = 8'b00000010;
				7: Y = 8'b00000001;
			endcase
	end
endmodule