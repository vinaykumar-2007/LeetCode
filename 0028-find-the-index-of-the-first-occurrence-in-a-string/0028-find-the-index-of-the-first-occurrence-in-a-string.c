#include <string.h>

int strStr(char* haystack, char* needle) {
    if (!haystack) return -1;          

    int l1 = strlen(haystack);
    int l2 = strlen(needle);

    if (l2 == 0) return 0;             
    if (l2 > l1) return -1;            
    for (int i = 0; i <= l1 - l2; i++) {
        int j;
        for (j = 0; j < l2; j++) {
            if (haystack[i + j] != needle[j]) {
                break;                  
            }
        }
        if (j == l2) return i;         
    }

    return -1;                         
}
