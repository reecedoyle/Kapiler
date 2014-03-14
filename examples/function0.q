def int sum(int i, int j) {
     return i + j;
}

def float sum(float i, float j) {
     return i + j;
}

void 
main {

  int s1 = sum(-10,20);
  float s2 = sum(10.0,-20.0);
  bool b;

  if (s1 < s2 && s1 == s2) {
     b  =  s1 + s2 / (s1 + s2) <= 30;
  } else {
     /* do something else */
  }
}
