import logo from './logo.svg';
import './App.css';
import { CohortsData} from './Cohort'
import CohortDetails from './CohortDetails'; 
import Styles from './CohortDetails.module.css'

function App() {
 
  return (
  <div className="cohort-container">
    <h1>Cohorts Details</h1>
     <div className='cohort-grid'>
    {CohortsData.map(cohort => <CohortDetails cohort={cohort}/>)}
    </div>
  </div>
  );
}

export default App;
