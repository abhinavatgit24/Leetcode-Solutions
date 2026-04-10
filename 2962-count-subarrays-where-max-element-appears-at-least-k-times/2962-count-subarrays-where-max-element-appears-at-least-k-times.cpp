#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    long long countSubarrays(vector<int>& nums, int k) {
        int n = nums.size();
        int mx = *max_element(nums.begin(), nums.end());

        vector<int> pos;
        for (int i = 0; i < n; i++) {
            if (nums[i] == mx) pos.push_back(i);
        }

        long long ans = 0;

        for (int i = 0; i + k - 1 < pos.size(); i++) {
            int left = (i == 0) ? pos[i] + 1 : pos[i] - pos[i - 1];
            int right = n - pos[i + k - 1];
            ans += 1LL * left * right;
        }

        return ans;
    }
};