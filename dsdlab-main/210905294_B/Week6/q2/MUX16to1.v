
module MUX16to1(w,s,f);
	input [0:15]w; 
	input [3:0]s;
	output f;
	wire [0:3]ft;

	MUX4to1 s1(w[0:3], s[1:0], ft[0]);
	MUX4to1 s2(w[4:7], s[1:0], ft[1]);
	MUX4to1 s3(w[8:11], s[1:0], ft[2]);
	MUX4to1 s4(w[12:15], s[1:0], ft[3]);
	MUX4to1 s5(ft, s[3:2], f);
endmodule


module MUX4to1(w,s,f);
	input [3:0]w;
	input [1:0]s;
	output f;
	assign f = s[1] ? (s[0] ? w[3] : w[2]) : (s[0] ? w[1] : w[0]);
endmodule

