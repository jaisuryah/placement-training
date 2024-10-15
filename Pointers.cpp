#include <iostream>
using namespace std;

void swap(int *a,int *b)
{
    int temp = *a;
    *a=*b;
    *b=temp;
}

int findmax(int *arr,int n)
{
    int max=*arr;
    for(int i=1;i<n;i++)
    {
        if(*(arr+i)>max)
        {
            max=*(arr+i);
        }
    }
    
    return max;
}

int findsum(int *arr,int n)
{
    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum+=*(arr+i);
    }
    return sum;
}

int findavg(int *arr,int n)
{
    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum+=*(arr+i);
    }
    return sum/n;
}

void reverse(char *a,int n)
{
    char *end=a;
    while(*end)
    {
        end++;
    }
    end--;
    
    while(a<end)
    {
        char temp=*a;
        *a=*end;
        *end = temp;
        a++;
        end--;
    }
}

void copy(char *d,char *a)
{
    while(*a!='\0'){
        *d=*a;
        a++;
        d++;
    }
    *d='\0';
}

bool search(char *a,char target,int n)
{
    for(int i=0;i<n;i++)
    {
        if(*(a+i)==target)
        {
            return true;
        }
    }
    return false;
}

bool search(int *a,int target,int n)
{
    for(int i=0;i<n;i++)
    {
        if(*(a+i)==target)
        {
            return true;
        }
    }
    return false;
}

int factorial(int n)
{

    if (n == 0 || n == 1) {
        return 1;
    }

    return n * factorial(n - 1);
}

int fibba(int n)
{
    if(n==0 || n==1)
    {
        return n;
    }
    else
    {
        return fibba(n-1)+fibba(n-2);
    }
        
    
}


int main() {
    // int a =10;
    // int *b = &a;
    
    // cout<<a<<endl;
    // cout<<&a<<endl;
    // cout<<*b<<endl;
    // cout<<b<<endl<<endl;
    
    int arr[] = {1,2,3,4,5};
    
    // cout<<arr<<endl;
    // cout<<*arr<<endl;
    // cout<<&arr[0]<<endl;
    // cout<<arr[0]<<endl;
    
    // int a =10,b=20,temp;
    // temp=a;
    // a=b;
    // b=temp;
    // cout<<a<<" "<<b;
    
    // int a=10,b=20;
    // swap(&a,&b);
    // cout<<a<<" "<<b;
    
    // int n = sizeof(arr)/sizeof(arr[0]);
    // cout<<findmax(arr,n)<<endl;
    // cout<<findsum(arr,n);
    // cout<<findavg(arr,n);
    
    // char a[] = "hello";
    // char target = 'e';
    // int n = sizeof(a)/sizeof(a[0]);
    
    // if(search(a,target,n)){
    //     cout<<"present";
    // }
    // else
    // {
    //     cout<<"absent";
    // }
    // char d[25];
    // reverse(a,n);
    // copy(d,a);
    // cout<<d;
    
    // int target=3;
    // int n = sizeof(arr)/sizeof(arr[0]);
    // if(search(arr,target,n)){
    //     cout<<"present";
    // }
    // else
    // {
    //     cout<<"absent";
    // }
    
    // int n;
    // cin>>n;
    // int fact=1;
    // for(int i=1;i<=n;i++)
    // {
    //     fact*=i;
    // }
    // cout<<fact<<endl;
    // cout<<factorial(n);
    
//     int n,i=0;
//     cin>>n;
//     while(i < n) {
//   cout << " " << fibba(i);
//   i++;
// }

    char str[] = "hello";
    int vowels=0;
    int conso=0;
    for(int i = 0; str[i]; i++)  
    {
        if(str[i]=='a'|| str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'
        ||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O' ||str[i]=='U')
        {
		    vowels++;
        }
        else
        {
            conso++;
        }
    }
    cout<<vowels;
    cout<<conso;
    
    
    
    
    
    
}
