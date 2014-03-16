list l1 = ["a","b", "c", "d", "e"];
list l2 = [1,2,3,4,5];
 
string s1 = "";
string s2 = "hello";;

void main
{

  list fnewlist = l1 :: l2;
  list anotherlist = [s1] :: [s2] :: newlist;
  list thirdlist = l2[:-2] :: l2[3:];

  bool b = len(thirdlist) == len(l2);


  if (len(newlist) <= len(anotherlist)) {
     newlist = newlist + anotherlist[0];
  } else {
     nelist = newlist - newlist[0];
  }
  
}
