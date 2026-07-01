import { Link, Route, Routes } from 'react-router-dom';
import Home from './Home';
import About from './About';
import Contact from './Contact';
import Login from './Login';

function Router() {
  return (
    <>
      <nav>
        <h1>landing page</h1>
        <Link to="/home"> Home </Link>
        <Link to="/contact"> Contact </Link>
        <Link to="/about"> About </Link>
        <Link to="/login"> Login </Link>
      </nav>

      <Routes>
        <Route path="/home" element={<Home />} />
        <Route path="/contact" element={<Contact />} />
        <Route path="/about" element={<About />} />
        <Route path="/login" element={<Login />} />
      </Routes>
    </>
  );
}

export default Router;