string s1 = "Alice in Wonderland";
string s2 = "Gilgamesh";
string s3 = "One Thousand and One Nights";

void main {
  string key = "ic";  
  list books = [s1,s2,s3];

  boll found  = false;
  int i = 0;
  string tmp;

  while (i<len(books)) do {
     tmp = books[i];
     if (key in tmp) { found = true; }
     else {}
     i = i + 1;
  }
  return 0;
}
