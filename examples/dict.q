def dict invert(dict d) {
  t:dict = [||]; 
  i:int = 0;
  if( len(d) > 0 ){
    while ( i < len(d) ) do {
      t[d[i]] = i;
      i = i + 1;  
	  }
  } else {}
  return t;
}

dict a = [||];

void main {
  string input;
  int i = 0;
  while( input == "q" ) do {
    read input;
    a[i] = input;
    i = i + 1;
  }
    
  dict b = invert(a);
}
