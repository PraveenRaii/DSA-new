function download(url, down){
    console.log("img start downloading....");
    setTimeout(() => {
        let img =url.split('/').pop();
        down(img);
    }, 2000);
    
}

function compress(img, cmp){
    console.log("img start compressing.....");
    setTimeout(() => {
        
        let cimg = img.split('.')[0]+".zip";
        cmp(cimg);
    }, 4000);
    
}

function upload(cimg,upl){
    console.log("img start uploding....");
    setTimeout(() => {
        let u = "http://localhost:3000/"+cimg;
        upl(u);
    }, 5000);
    
}



let url = "http://www.facebook.com/photo.jpg";

download(url, function down(img){
 console.log("img downloded successfully",img);
 compress(img, function cmp(cimg){
    console.log("file compressed succesfully...", cimg);
    
    upload(cimg, function upl(u){
        console.log("img uploaded succesfully...",u);
        
    })
 })
 
})