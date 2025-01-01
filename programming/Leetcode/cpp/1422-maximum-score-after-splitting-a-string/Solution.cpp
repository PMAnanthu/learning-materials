#include<stdio.h>
#include<iostream>
#include <climits>

class Solution {
public:
    int maxScore(std::string s) {
        int once=0;
        int zeros=0;
        int best= INT_MIN;
		for(int i=0;i<s.size()-1;i++){
			if(s[i]=='1'){
				once++;
			}else{
				zeros++;
			}
			best=std::max(best,zeros-once);
		}

		if(s[s.size()-1]=='1'){
			once++;
		}
		return best+once;
    }
};


int main(){
	Solution* s=new Solution();
	std::cout<<s->maxScore("011101");
	return 1;
}