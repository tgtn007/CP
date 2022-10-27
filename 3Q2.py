class Magic:

    def __init__(self,x,y):
        self.m1=x
        self.m2=y
        
    def __add__(self,other):
     
    
        return (self.m1+self.m2+other)
    def __sub__(self,other):
     
        return(self.m1-self.m2+other)

ma=Magic(3,4)
ma1=ma.__add__(2)
print(ma1)
su=ma.__sub__(5)
print(su)
