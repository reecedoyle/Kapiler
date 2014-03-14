
tdef person : name:string, surname:string, age:int; // person definition

tdef family : mother:person, father:person, children:list; // family definition

void main { 

// here we generate
/* a family */

  person m = "aaaaAAA", "bbBB0_i", 40;
  person p = "aaabAAA", "bbBB0_i", 35;
  person c1 = "aaabAAA", "bbBB0_i", 1;
  person c2 = "aaadAAA", "bbBB0_i", 2;
  person c3 = "aaaeAAA", "bbBB0_i", 3;

  family f = m,p,[c1,c2];
  f.children = f.children :: [c3];
}
