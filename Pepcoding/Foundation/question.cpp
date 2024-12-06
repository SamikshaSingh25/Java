#include<iostream>
#include<bits/stdc++.h>
using namespace std;
#define R 2
#define C 2

vector<int> WavePrint(int n , int m , int arr[R][C]){
    vector<int> wave;
    for(int j=0;j<m;j++){
        if(j%2!=0){
            for(int i=0;i<n;i++){
                // cout<<arr[i][j]<<" ";
                wave.push_back(arr[i][j]);
            }

        }
        else{
            for(int i=n-1;i>=0;i--){
                // cout<<arr[i][j]<<" ";
                wave.push_back(arr[i][j]);
            }
        }
    }
    return wave;
}


vector<int> UniqueIndexes(vector<int> &wavePattern){
    vector<int> Wavepattern = WavePrint(R,C,arr);
    vector<int> uniqueele;
    for(int ele : Wavepattern){
        if(find(uniqueele.begin(),uniqueele.end(),ele)==uniqueele.end()){
            uniqueele.push_back(ele);
        }
    }
    // cout << "Wave pattern with unique elements: ";
    // for (int ele : uniqueele) {
    //     uniqueele.push_back(ele)
    // }
    // cout << endl;
    return uniqueele;

}

// vector<int> UniqueIndexes(vector<int> &wavePattern) {
//     vector<int> uniqueIn;
//     for (int i = 0; i < wavePattern.size(); i++) {
//         if (find(uniqueIn.begin(), uniqueIn.end(), wavePattern[i]) == uniqueIn.end()) {
//             uniqueIn.push_back(i);
//         }
//     }
//     return uniqueIn;
// }

void conditions(int rowArr[R][C],int colArr[R][C],int k){
    vector<int> rowwave= WavePrint(R,C,rowArr);
    vector<int> colwave= WavePrint(R,C,colArr);

    vector<int> rowIndex = UniqueIndexes(rowwave);
    vector<int> colIndex = UniqueIndexes(colwave);

    vector<vector<int>> finalMatrix(k, vector<int>(k, 0));

    for (int i = 0; i < k; i++) {
        for (int j = 0; j < k; j++) {
            if (i < rowIndex.size() && j < colIndex.size()) {
                finalMatrix[i][j] = rowwave[rowIndex[i]] + colwave[colIndex[j]];
            }
        }
    }

    cout << "Final matrix:" << endl;
    for (int i = 0; i < k; i++) {
        for (int j = 0; j < k; j++) {
            cout << finalMatrix[i][j] << " ";
        }
        cout << endl;
    }

}

int main()
{
    int k = 3;
    int row[R][C] = {{1, 2}, {3, 2}};
    int col[R][C] = {{2, 1}, {3, 2}};

    cout << "For row and col matrices:" << endl;
    conditions(row, col, k);

    return 0;
}