module q4(y, o, w); 
 
	input [0:7] y;
	input [2:0] w;
	 
	output o1; 

	decoder1 dc1(.sel1(sel1), .sel2(sel2), .sel3(sel3), .o1(c1), .o2(c2), .o3(c3), .o4(c4), .o5(c5), .o6(c6), .o7(c7), .o8(c8)); 
 
	and a1(b1, i1, c1); 
	and a2(b2, i2, c2); 
	and a3(b3, i3, c3); 
	and a4(b4, i4, c4); 
	and a5(b5, i5, c5); 
	and a6(b6, i6, c6); 
	and a7(b7, i7, c7); 
	and a8(b8, i8, c8); 
 
	or or1(o1, b1, b2, b3, b4, b5, b6, b7, b8); 
 
endmodule 


module decoder1(sel1, sel2, sel3, o1, o2, o3, o4, o5, o6, o7, o8); 
   
    input sel1; 
    input sel2; 
    input sel3; 
         
    output o1; 
    output o2; 
    output o3; 
    output o4; 
    output o5; 
    output o6; 
    output o7; 
    output o8; 

    reg [7:0] o_temp; 
         
    always @(sel1 or sel2 or sel3) 
    begin 
     
    	case({sel1, sel2, sel3}) 
     
    		0 : 
    			o_temp = 8'b10000000; 
    		1 : 
    			o_temp = 8'b01000000;	
    		2 : 
    			o_temp = 8'b00100000;	
    		3 : 
    			o_temp = 8'b00010000;	
    		4 : 
    			o_temp = 8'b00001000;	
    		5 : 
    			o_temp = 8'b00000100;		
    		6 : 
    			o_temp = 8'b00000010; 
    		7 : 
    			o_temp = 8'b00000001;	
     
        endcase 
    end 
     
    assign o1 = o_temp[0]; 
    assign o2 = o_temp[1]; 
    assign o3 = o_temp[2]; 
    assign o4 = o_temp[3]; 
    assign o5 = o_temp[4]; 
    assign o6 = o_temp[5]; 
    assign o7 = o_temp[6]; 
    assign o8 = o_temp[7]; 
     
endmodule 