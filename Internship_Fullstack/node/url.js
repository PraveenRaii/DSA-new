let URL = require('url');
 let myurl = URL.parse('https://example.com:8080/home?query=product#12312');

 console.log(myurl.pathname);
 console.log(myurl.hash);
 console.log(myurl.host);
 console.log(myurl.port);
 console.log(myurl.hostname);
 console.log(myurl.query);
 console.log(myurl.protocol);

 

// const { log } = require('console');
// const { URL } = require('url');
// const myurl = new URL(
//   'https://app.zoom.us/wc/81087499812/join?ref_from=launch&tk=I_FRsBc_KMTveSTrBdF15MluqnvX7BD1dEhlunFY1Ws.DQkAAAAS4TEOJBZjd3otaXZuSFJPbVk1NzdCRWhwbkxRAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA&pwd=5oJ8OCGZHrsB1Ja1bRo3UhxoOr6HQV.1&_x_zm_rtaid=hGrftBVHSXSVkSPKF4Xz4Q.1782369447636.2a6f0cb931e05a732487123daae2053a&_x_zm_rhtaid=547&fromPWA=1'
// );

// console.log(myurl.pathname);
// console.log(myurl.hash);
// console.log(myurl.port);
// console.log(myurl.host);
// console.log(myurl.hostname);
// console.log(myurl.search);
// console.log(myurl.protocol);