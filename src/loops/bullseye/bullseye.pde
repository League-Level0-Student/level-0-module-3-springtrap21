 void setup(){
       size(1000,1000);

    }

    void draw(){
  int size = 200;
      for(int i = 0; i < 10 ;i++){
          if(i % 2 == 0){
            fill(#00F2FC);
          }
          else{
            fill(#9200FC);
          }
          ellipse(500, 500, size, size);
          size -= 20;
         }
      
    }
