class job
{
	public:
	int jobid;  //job id
	int deadline; //deadline
	int profit; //profit of the job
};
bool mycompare(job *x,job *y)//boolean function
{
	//sort as per decreasing profite
    return x->profit>y->profit; 
}
sort(obj,obj+n,mycompare);