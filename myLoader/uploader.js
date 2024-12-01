//start server
//const myArray = []

//class server
    //upload_method
        //while server is running
            //if request == "Upload"
                //add file to myArray
            //if request == "Download"
                //get file name
                //find file in myArray
                //if file == myArray[0]
                //get file ""
                //make copy of file
                //give copy to user
        //call upload_method

const http = require('http');
const hostname = '127.0.0.1';
const port = 3000;

const server = http.createServer((req, res) => {
    res.statusCode = 200;
    res.setHeader('Content-Type', 'test/plain');
    res.end('Hello World from my server!\n')
});
server.listen(port, hostname, () => {
    console.log('Server running at http://${hostname}:${port}/`')
});